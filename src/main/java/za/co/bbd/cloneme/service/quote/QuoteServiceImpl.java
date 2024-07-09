package za.co.bbd.cloneme.service.quote;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class QuoteServiceImpl implements QuoteService {

////    @Autowired
////    private QuoteRepository quoteRepository;
//
//    private final BigDecimal standardFee = new BigDecimal("60.00");
//    private final BigDecimal standardRatePerHour = new BigDecimal("150.00");
//    private final BigDecimal standardRatePerKM = new BigDecimal("5.00");
//
//    @Override
//    public List<QuoteDao> getQuoteByErrandId(Long errandId) {
//        log.debug("Getting quotes with errandId: {}", errandId);
//        try {
//            return quoteRepository.findByErrandId(errandId);
//        } catch (EntityNotFoundException e) {
//            log.error("No quote found with errandId: {}", errandId);
//            throw new ClonemeException("No quote found with errandId: " + errandId);
//        } catch (Exception ex) {
//            log.error("Failed to get quotes: {}", ex.getMessage(), ex);
//            throw new ClonemeException("Failed to get quotes: " + ex.getMessage());
//        }
//    }
//
//    @Override
//    public BigDecimal createQuote(QuoteDto quote) {
//        log.debug("Generating quote");
//
//        BigDecimal timeInHours = quote.getTime().divide(new BigDecimal("60"), RoundingMode.UP);
//        BigDecimal distance = quote.getDistance();
//        BigDecimal cost = computeCost(timeInHours, distance);
//
//        saveQuote(QuoteDao.builder()
//                .errandId(quote.getErrandId())
//                .cost(cost)
//                .timeEstimate(quote.getTime())
//                .distanceEstimate(distance)
//                .build());
//
//        return cost.subtract(standardFee);
//    }
//
//    private BigDecimal computeCost(BigDecimal hours, BigDecimal distance) {
//        log.debug("Calculating cost");
//        return standardFee
//                .add(standardRatePerHour.multiply(hours))
//                .add(standardRatePerKM.multiply(distance));
//    }
//
//    private void saveQuote(QuoteDao quoteDao) {
//        log.debug("Storing quote");
//        try {
//            quoteRepository.save(quoteDao);
//        } catch (Exception e) {
//            log.error("Failed to store Quote in DB: {}", e.getMessage(), e);
//            throw new ClonemeException("Failed to store Quote in DB: " + e.getMessage());
//        }
//    }

}
