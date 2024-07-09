package za.co.bbd.cloneme.service.errand;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ErrandServiceImpl implements ErrandService {
//    @Autowired
//    private ErrandRepository errandRepository;
//
//    @Override
//    public List<ErrandDao> getErrand(Long errandId) {
//        if (errandId == null) {
//            log.debug("Fetching all errands");
//            try {
//                return errandRepository.findAll();
//            } catch (Exception e) {
//                log.error("Could not get errands: {}", e.getMessage(), e);
//                throw new ClonemeException("Could not get errands: " + e.getMessage());
//            }
//        } else {
//            log.debug("Fetching errand with id: {}", errandId);
//            try {
//                return List.of(errandRepository.getReferenceById(errandId));
//            } catch (EntityNotFoundException e) {
//                log.error("Could not find errand with id {}: {}", errandId, e.getMessage(), e);
//                throw new ClonemeException("Could not find errand with id " + errandId + ": " + e.getMessage());
//            } catch (Exception ex) {
//                log.error("Could not get errand: {}", ex.getMessage(), ex);
//                throw new ClonemeException("Could not get errand: " + ex.getMessage());
//            }
//        }
//    }
//
//    @Override
//    public ErrandDao createErrand(MultipartFile voicenote, String fileName) {
//        log.info("Saving voice note file");
//
//        //directory to save received voice notes
//        File directory = new File("src/main/resources/voiceNotes/");
//        if (!directory.exists()) {
//            directory.mkdirs();
//        }
//
//        String filePath = directory.getPath() + File.separator + voicenote.getOriginalFilename();
//
//        try (InputStream in = voicenote.getInputStream();
//             //Save file to the directory
//             FileOutputStream out = new FileOutputStream(filePath)) {
//
//            //Read the file contents in chunks(bytes) of 1024
//            byte[] buffer = new byte[1024];
//            int bytesRead;
//            while ((bytesRead = in.read(buffer)) != -1) {
//                out.write(buffer, 0, bytesRead);
//            }
//            log.info("File saved successfully");
//        } catch(Exception e) {
//            log.error("File saving failed: {}", e.getMessage(), e);
//            throw new ClonemeException("File saving failed:" + e.getMessage());
//        }
//
//        log.debug("Creating errand");
//        ErrandDao dao = ErrandDao.builder()
//                .voicenoteId(fileName)
//                .status(ErrandStatus.OPEN)
//                .build();
//
//        try {
//            dao =  errandRepository.save(dao);
//        } catch (Exception e) {
//            log.error("Unable to save Errand to DB: {}", e.getMessage(), e);
//            throw new ClonemeException("Unable to save Errand to DB: " + e.getMessage());
//        }
//        log.debug("Errand saved: {}", dao);
//        return dao;
//    }
//
//    @Override
//    public ErrandDao updateErrand(Long errandId, String status) {
//        log.debug("Updating errand: {} with status: {}", errandId, status);
//        ErrandDao errandDao;
//        try {
//            errandDao = errandRepository.getReferenceById(errandId);
//        } catch (EntityNotFoundException e) {
//            log.error("Could not find errand with id {}: {}", errandId, e.getMessage(), e);
//            throw new ClonemeException("Could not find errand with id " + errandId + ": " + e.getMessage());
//        } catch (Exception ex) {
//            log.error("Could not get errand: {}", ex.getMessage(), ex);
//            throw new ClonemeException("Could not get errand: " + ex.getMessage());
//        }
//
//        if (status.equalsIgnoreCase(CLOSED.name())) {
//            deleteErrand(errandId, errandDao.getVoicenoteId());
//        } else {
//            errandDao = updateErrandStatus(errandId, status);
//        }
//        return errandDao;
//    }
//
//    private void deleteErrand(Long errandId, String voicenoteId) {
//        errandRepository.deleteById(errandId);
//        try {
//            String filePath = "src/main/resources/voiceNotes/" + voicenoteId + ".m4a";
//
//            if (!Files.deleteIfExists(Path.of(filePath))) {
//                log.error("Failed to delete file: {}", filePath);
//                throw new ClonemeException("Failed to delete file: " + filePath);
//            }
//        } catch (IOException e) {
//            log.error("Could not delete file: {}", e.getMessage(), e);
//            throw new ClonemeException("Could not delete file: " + e.getMessage());
//        }
//    }
//
//    private ErrandDao updateErrandStatus(Long errandId, String status) {
//        try {
//            ErrandDao errandDao = errandRepository.getReferenceById(errandId);
//            errandDao.setStatus(ErrandStatus.valueOf(status));
//            return errandRepository.save(errandDao);
//        } catch (EntityNotFoundException e) {
//            log.error("Unable to find errand with id {}: {}", errandId, e.getMessage(), e);
//            throw new ClonemeException("Unable to find errand with id " + errandId + ": " + e.getMessage());
//        } catch (Exception ex) {
//            log.error("Unable to update Errand to DB: {}", ex.getMessage(), ex);
//            throw new ClonemeException("Unable to update Errand to DB: " + ex.getMessage());
//        }
//    }
}
