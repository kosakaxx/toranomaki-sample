package com.toranomaki.api.sample.controller;

import com.toranomaki.api.SampleApi;
import com.toranomaki.model.SampleRequestBody;
import com.toranomaki.model.SampleResponseBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class SampleApiController implements SampleApi {

  @Override
  public ResponseEntity<SampleResponseBody> samplePost(
      Integer query,
      String header,
      SampleRequestBody sampleRequestBody) {

    SampleResponseBody response = new SampleResponseBody()
        .header(header)
        .query(query)
        .message(sampleRequestBody.getMessage());

    return new ResponseEntity<>(response, HttpStatus.OK);
  }
}
