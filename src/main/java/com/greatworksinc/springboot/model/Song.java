package com.greatworksinc.springboot.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Value;

@Builder(toBuilder = true, builderClassName = "Builder")
@JsonDeserialize(builder = Song.Builder.class)
@Value
public class Song {

  Long id;
  String name;
  int length;
  int stars;

  @JsonPOJOBuilder(withPrefix = "")
  public static class Builder {}
}
