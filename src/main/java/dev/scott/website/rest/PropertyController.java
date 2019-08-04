package dev.scott.website.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class PropertyController {


    @RequestMapping(path = "property",
                    method = RequestMethod.GET,
                    produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Map> getProperties() {
        final Map<String, Object> properties = new HashMap<>();
        final ResponseEntity<Map> response = new ResponseEntity<>(properties, HttpStatus.OK);
        return response;
    }

}
