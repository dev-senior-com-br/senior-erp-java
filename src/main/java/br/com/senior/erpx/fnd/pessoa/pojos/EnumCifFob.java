/*
 * Pessoa
 * Serviço de Gestão de Pessoas do ERPX
 *
 * OpenAPI spec version: 1.12.1
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.erpx.fnd.pessoa.pojos;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets enumCifFob
 */
@JsonAdapter(EnumCifFob.Adapter.class)
public enum EnumCifFob {
  
  V0("V0"),
  
  V1("V1"),
  
  V2("V2"),
  
  V3("V3"),
  
  V4("V4"),
  
  V9("V9");

  private String value;

  EnumCifFob(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumCifFob fromValue(String text) {
    for (EnumCifFob b : EnumCifFob.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EnumCifFob> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumCifFob enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumCifFob read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumCifFob.fromValue(String.valueOf(value));
    }
  }
}

