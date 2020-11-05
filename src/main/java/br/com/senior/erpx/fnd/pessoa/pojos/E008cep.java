/*
 * Pessoa
 * Serviço de Gestão de Pessoas do ERPX
 *
 *
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.erpx.fnd.pessoa.pojos;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import br.com.senior.erpx.fnd.pessoa.pojos.E008rai;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * E008cep
 */




public class E008cep {
  @SerializedName("logEnd")
  private String logEnd = null;

  @SerializedName("usualt")
  private String usualt = null;

  @SerializedName("excluido")
  private Boolean excluido = null;

  @SerializedName("baiEnd")
  private String baiEnd = null;

  @SerializedName("dthger")
  private OffsetDateTime dthger = null;

  @SerializedName("cepIni")
  private Integer cepIni = null;

  @SerializedName("dthalt")
  private OffsetDateTime dthalt = null;

  @SerializedName("e008rai")
  private E008rai e008rai = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("usuger")
  private String usuger = null;

  public E008cep logEnd(String logEnd) {
    this.logEnd = logEnd;
    return this;
  }

   /**
   * Logradouro
   * @return logEnd
  **/
  @ApiModelProperty(value = "Logradouro")
  public String getLogEnd() {
    return logEnd;
  }

  public void setLogEnd(String logEnd) {
    this.logEnd = logEnd;
  }

  public E008cep usualt(String usualt) {
    this.usualt = usualt;
    return this;
  }

   /**
   * 
   * @return usualt
  **/
  @ApiModelProperty(value = "")
  public String getUsualt() {
    return usualt;
  }

  public void setUsualt(String usualt) {
    this.usualt = usualt;
  }

  public E008cep excluido(Boolean excluido) {
    this.excluido = excluido;
    return this;
  }

   /**
   * Indica se o registro foi excluído
   * @return excluido
  **/
  @ApiModelProperty(value = "Indica se o registro foi excluído")
  public Boolean isExcluido() {
    return excluido;
  }

  public void setExcluido(Boolean excluido) {
    this.excluido = excluido;
  }

  public E008cep baiEnd(String baiEnd) {
    this.baiEnd = baiEnd;
    return this;
  }

   /**
   * Bairro
   * @return baiEnd
  **/
  @ApiModelProperty(value = "Bairro")
  public String getBaiEnd() {
    return baiEnd;
  }

  public void setBaiEnd(String baiEnd) {
    this.baiEnd = baiEnd;
  }

  public E008cep dthger(OffsetDateTime dthger) {
    this.dthger = dthger;
    return this;
  }

   /**
   * 
   * @return dthger
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDthger() {
    return dthger;
  }

  public void setDthger(OffsetDateTime dthger) {
    this.dthger = dthger;
  }

  public E008cep cepIni(Integer cepIni) {
    this.cepIni = cepIni;
    return this;
  }

   /**
   * CEP endereço
   * @return cepIni
  **/
  @ApiModelProperty(value = "CEP endereço")
  public Integer getCepIni() {
    return cepIni;
  }

  public void setCepIni(Integer cepIni) {
    this.cepIni = cepIni;
  }

  public E008cep dthalt(OffsetDateTime dthalt) {
    this.dthalt = dthalt;
    return this;
  }

   /**
   * 
   * @return dthalt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDthalt() {
    return dthalt;
  }

  public void setDthalt(OffsetDateTime dthalt) {
    this.dthalt = dthalt;
  }

  public E008cep e008rai(E008rai e008rai) {
    this.e008rai = e008rai;
    return this;
  }

   /**
   * Get e008rai
   * @return e008rai
  **/
  @ApiModelProperty(value = "")
  public E008rai getE008rai() {
    return e008rai;
  }

  public void setE008rai(E008rai e008rai) {
    this.e008rai = e008rai;
  }

  public E008cep id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public E008cep usuger(String usuger) {
    this.usuger = usuger;
    return this;
  }

   /**
   * 
   * @return usuger
  **/
  @ApiModelProperty(value = "")
  public String getUsuger() {
    return usuger;
  }

  public void setUsuger(String usuger) {
    this.usuger = usuger;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    E008cep e008cep = (E008cep) o;
    return Objects.equals(this.logEnd, e008cep.logEnd) &&
        Objects.equals(this.usualt, e008cep.usualt) &&
        Objects.equals(this.excluido, e008cep.excluido) &&
        Objects.equals(this.baiEnd, e008cep.baiEnd) &&
        Objects.equals(this.dthger, e008cep.dthger) &&
        Objects.equals(this.cepIni, e008cep.cepIni) &&
        Objects.equals(this.dthalt, e008cep.dthalt) &&
        Objects.equals(this.e008rai, e008cep.e008rai) &&
        Objects.equals(this.id, e008cep.id) &&
        Objects.equals(this.usuger, e008cep.usuger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logEnd, usualt, excluido, baiEnd, dthger, cepIni, dthalt, e008rai, id, usuger);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class E008cep {\n");
    
    sb.append("    logEnd: ").append(toIndentedString(logEnd)).append("\n");
    sb.append("    usualt: ").append(toIndentedString(usualt)).append("\n");
    sb.append("    excluido: ").append(toIndentedString(excluido)).append("\n");
    sb.append("    baiEnd: ").append(toIndentedString(baiEnd)).append("\n");
    sb.append("    dthger: ").append(toIndentedString(dthger)).append("\n");
    sb.append("    cepIni: ").append(toIndentedString(cepIni)).append("\n");
    sb.append("    dthalt: ").append(toIndentedString(dthalt)).append("\n");
    sb.append("    e008rai: ").append(toIndentedString(e008rai)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    usuger: ").append(toIndentedString(usuger)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

