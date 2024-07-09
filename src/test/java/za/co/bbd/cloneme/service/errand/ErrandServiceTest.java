//package za.co.bbd.cloneme.service.errand;
//
//import jakarta.persistence.EntityNotFoundException;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.mock.web.MockMultipartFile;
//import za.co.bbd.cloneme.infrastructure.data.entity.ErrandDao;
//import za.co.bbd.cloneme.infrastructure.data.repository.ErrandRepository;
//import za.co.bbd.cloneme.model.ErrandStatus;
//import za.co.bbd.cloneme.model.exception.ClonemeException;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.OutputStream;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.ArgumentMatchers.anyLong;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//public class ErrandServiceTest {
//    @InjectMocks
//    private ErrandServiceImpl mockService;
//
//    @Mock
//    private ErrandRepository mockRepository;
//
//    @Test
//    void whenGetErrand_specific_success() {
//        when(mockRepository.getReferenceById(anyLong()))
//                .thenReturn(new ErrandDao());
//
//        assertEquals(List.of(new ErrandDao()), mockService.getErrand(1L));
//        verify(mockRepository, times(1)).getReferenceById(anyLong());
//    }
//
//    @Test
//    void whenGetErrand_all_success() {
//        when(mockRepository.findAll())
//                .thenReturn(List.of(new ErrandDao()));
//
//        assertEquals(List.of(new ErrandDao()), mockService.getErrand(null));
//        verify(mockRepository, times(1)).findAll();
//    }
//
//    @Test
//    void whenGetErrand_all_throwsException() {
//        when(mockRepository.findAll())
//                .thenThrow(new RuntimeException("fail"));
//
//        ClonemeException exception =
//                assertThrows(ClonemeException.class, () -> mockService.getErrand(null));
//
//        assertEquals("Could not get errands: fail", exception.getMessage());
//        verify(mockRepository, times(1)).findAll();
//    }
//
//    @Test
//    void whenGetErrand_specific_throwsException() {
//        when(mockRepository.getReferenceById(anyLong()))
//                .thenThrow(new RuntimeException("fail"));
//
//        ClonemeException exception =
//                assertThrows(ClonemeException.class, () -> mockService.getErrand(1L));
//
//        assertEquals("Could not get errand: fail", exception.getMessage());
//        verify(mockRepository, times(1)).getReferenceById(1L);
//    }
//
//    @Test
//    void whenGetErrand_specific_cantFind_throwsException() {
//        when(mockRepository.getReferenceById(anyLong()))
//                .thenThrow(new EntityNotFoundException("fail"));
//
//        ClonemeException exception =
//                assertThrows(ClonemeException.class, () -> mockService.getErrand(1L));
//
//        assertEquals("Could not find errand with id 1: fail", exception.getMessage());
//        verify(mockRepository, times(1)).getReferenceById(1L);
//    }
//
//    @Test
//    void whenCreateErrand_success() {
//        // Creating a mock MultipartFile
//        byte[] content = "testContent".getBytes();
//        MockMultipartFile mockMultipartFile = new MockMultipartFile("TestFile", "MockFileName.m4a", "audio/m4a", content);
//
//        ErrandDao mockErrandDao = ErrandDao.builder()
//                .id(1L)
//                .voicenoteId("testFileName")
//                .status(ErrandStatus.OPEN)
//                .build();
//
//        when(mockRepository.save(any(ErrandDao.class)))
//                .thenReturn(mockErrandDao);
//
//        ErrandDao actual = mockService.createErrand(mockMultipartFile, "MockFileName");
//        assertNotNull(actual);
//        assertEquals(mockErrandDao, actual);
//        verify(mockRepository, times(1)).save(any(ErrandDao.class));
//
//        //Save file in folder then delete for clean folder
//        File savedFile = new File("src/main/resources/voiceNotes/MockFileName.m4a");
//        if (savedFile.exists()) {
//            savedFile.delete();
//        }
//    }
//
//    @Test
//    void whenCreateErrand_failSave_throwsException() {
//        byte[] content = "testContent".getBytes();
//        MockMultipartFile mockMultipartFile = new MockMultipartFile("TestFile", "MockFileName.m4a", "audio/m4a", content);
//
//        when(mockRepository.save(any(ErrandDao.class)))
//                .thenThrow(new RuntimeException("fail"));
//
//        ClonemeException exception =
//                assertThrows(ClonemeException.class, () -> mockService.createErrand(mockMultipartFile, "TestFile"));
//
//        assertEquals("Unable to save Errand to DB: fail", exception.getMessage());
//        verify(mockRepository, times(1)).save(any(ErrandDao.class));
//    }
//
//    @Test
//    void whenSaveFile_failSave_throwsIOException() {
//        byte[] content = "testContent".getBytes();
//        MockMultipartFile mockMultipartFile = new MockMultipartFile("TestFile", "MockFileName.m4a", "audio/m4a", content);
//
//        IOException ioException =
//                assertThrows(IOException.class, () -> {
//                    try (OutputStream outputStream = new FileOutputStream("/wrong/path")) {
//                        outputStream.write(mockMultipartFile.getBytes());
//                    }
//                });
//
//        assertEquals("\\wrong\\path (The system cannot find the path specified)", ioException.getMessage());
//    }
//
//    @Test
//    void whenUpdateErrand_throwsEntityNotFoundException() {
//
//        when(mockRepository.getReferenceById(1L)).thenThrow(new EntityNotFoundException("Not found"));
//
//        assertThrows(ClonemeException.class, () -> mockService.updateErrand(1L, "IN_PROGRESS"));
//    }
//
//    @Test
//    void whenUpdateErrand_throwsGeneralException() {
//
//        when(mockRepository.getReferenceById(1L)).thenThrow(new RuntimeException("General error"));
//
//        assertThrows(ClonemeException.class, () -> mockService.updateErrand(1L, "IN_PROGRESS"));
//    }
//
//    @Test
//    void whenUpdateErrand_StatusOpen() {
//        ErrandDao errandDao = ErrandDao.builder()
//                .id(1L)
//                .voicenoteId("testVoiceNote")
//                .status(ErrandStatus.OPEN)
//                .build();
//
//        when(mockRepository.getReferenceById(1L)).thenReturn(errandDao);
//        when(mockRepository.save(any(ErrandDao.class))).thenReturn(errandDao);
//
//        ErrandDao updatedErrand = mockService.updateErrand(1L, "OPEN");
//
//        verify(mockRepository, times(2)).getReferenceById(1L);
//        verify(mockRepository, times(1)).save(any(ErrandDao.class));
//        assertEquals(ErrandStatus.OPEN, updatedErrand.getStatus());
//    }
//
//}
