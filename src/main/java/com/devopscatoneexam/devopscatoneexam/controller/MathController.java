package main.java.com.devopscatoneexam.devopscatoneexam.controller;


import main.java.com.devopscatoneexam.devopscatoneexam.model.DoMathRequest;
import main.java.com.devopscatoneexam.devopscatoneexam.service.MathOperator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doMaths")
public class MathController {

    private final MathOperator mathOperator;

    public MathController(MathOperator mathOperator) {
        this.mathOperator = mathOperator;
    }

    @PostMapping
    public ResponseEntity<ApiResponse> doMath(@RequestBody DoMathRequest dto){
        return ResponseEntity.ok(ApiResponse.success(mathService.doMath(dto.getOperand1(),dto.getOperand2(),dto.getOperation())));
    }
}
