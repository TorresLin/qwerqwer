package springmvctest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import springmvctest.io.spring.guides.gs_producing_web_service.GetCountryRequest;
import springmvctest.io.spring.guides.gs_producing_web_service.GetCountryResponse;



@Endpoint
public class CountryEndpoint {
    public static final String NAMESPACE_URI ="http://spring.io/guides/gs-producing-web-webservice";
    
    private CountryRepository countryRepository;
    
   @Autowired
    public CountryEndpoint(CountryRepository countryRepository) {
       this.countryRepository = countryRepository;
   }
   
   @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
   @ResponsePayload
   public GetCountryResponse getCoutnry(@RequestPayload GetCountryRequest request) {
       GetCountryResponse response = new GetCountryResponse();
       response.setCountry(countryRepository.findCountry(request.getName()));
       
       return response;
       
   }
}
