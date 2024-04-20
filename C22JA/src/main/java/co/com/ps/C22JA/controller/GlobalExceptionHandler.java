package co.com.ps.C22JA.controller;


import co.com.ps.C22JA.error.ProductoErrorMessage;
import co.com.ps.C22JA.error.UsuarioErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<String>  productoNotFoundException (ProductoErrorMessage a){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(a.getMessage());
    }

    @ExceptionHandler
    public ResponseEntity<String>  usuarioNotFoundException (UsuarioErrorMessage a){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(a.getMessage());
    }
}
