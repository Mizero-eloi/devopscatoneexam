package rw.rca.calculatorapp.integration;

import main.java.com.devopscatoneexam.devopscatoneexam.model.DoMathRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void doMath_addition_success(){
        DoMathRequest dto = new DoMathRequest(5.0,2.0,"+");
        ResponseEntity<ApiResponse> response = this.restTemplate.postForEntity("/doMaths",dto, ApiResponse.class);

        assertEquals(200,response.getStatusCode().value());
        assertEquals(7.0,response.getBody().getData());
    }

    @Test
    public void doMath_subtraction_success(){
        DoMathRequest dto = new DoMathRequest(7.0,2.0,"-");
        ResponseEntity<ApiResponse> response = this.restTemplate.postForEntity("/doMaths",dto, ApiResponse.class);

        assertEquals(200,response.getStatusCode().value());
        assertEquals(5.0,response.getBody().getData());
    }

    @Test
    public void doMath_multiplication_success(){
        DoMathRequest dto = new DoMathRequest(5.0,2.0,"*");
        ResponseEntity<ApiResponse> response = this.restTemplate.postForEntity("/doMaths",dto, ApiResponse.class);

        assertEquals(200,response.getStatusCode().value());
        assertEquals(10.0,response.getBody().getData());
    }

    @Test
    public void doMath_division_success(){
        DoMathRequest dto = new DoMathRequest(10.0,2.0,"/");
        ResponseEntity<ApiResponse> response = this.restTemplate.postForEntity("/doMaths",dto, ApiResponse.class);

        assertEquals(200,response.getStatusCode().value());
        assertEquals(5.0,response.getBody().getData());
    }

    @Test
    public void doMath_power_success(){
        DoMathRequest dto = new DoMathRequest(5.0,2.0,"**");
        ResponseEntity<ApiResponse> response = this.restTemplate.postForEntity("/doMaths",dto, ApiResponse.class);

        assertEquals(200,response.getStatusCode().value());
        assertEquals(25.0,response.getBody().getData());
    }

}
