/*
 * Produto
 * Serviço de Produto do ERPX
 *
 * OpenAPI spec version: 1.9.3
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.erpx.fnd.produto.pojos;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets enumExiMon
 */
@JsonAdapter(EnumExiMon.Adapter.class)
public enum EnumExiMon {
  
  VS("VS"),
  
  VN("VN"),
  
  VO("VO");

  private String value;

  EnumExiMon(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumExiMon fromValue(String text) {
    for (EnumExiMon b : EnumExiMon.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EnumExiMon> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumExiMon enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumExiMon read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumExiMon.fromValue(String.valueOf(value));
    }
  }
}

