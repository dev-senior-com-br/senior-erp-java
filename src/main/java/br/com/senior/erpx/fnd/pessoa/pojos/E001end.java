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
import br.com.senior.erpx.fnd.pessoa.pojos.E001pes;
import br.com.senior.erpx.fnd.pessoa.pojos.E006pai;
import br.com.senior.erpx.fnd.pessoa.pojos.E007ufs;
import br.com.senior.erpx.fnd.pessoa.pojos.E008cep;
import br.com.senior.erpx.fnd.pessoa.pojos.E008rai;
import br.com.senior.erpx.fnd.pessoa.pojos.EnumIndOba;
import br.com.senior.erpx.fnd.pessoa.pojos.EnumJurFis;
import br.com.senior.erpx.fnd.pessoa.pojos.EnumSitReg;
import br.com.senior.erpx.fnd.pessoa.pojos.EnumTipEnd;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * E001end
 */




public class E001end {
  @SerializedName("usualt")
  private String usualt = null;

  @SerializedName("dthger")
  private OffsetDateTime dthger = null;

  @SerializedName("cnpCpf")
  private String cnpCpf = null;

  @SerializedName("e008cep")
  private E008cep e008cep = null;

  @SerializedName("fonRes")
  private String fonRes = null;

  @SerializedName("celRes")
  private String celRes = null;

  @SerializedName("e001pes")
  private E001pes e001pes = null;

  @SerializedName("tipLoc")
  private EnumTipEnd tipLoc = null;

  @SerializedName("insEst")
  private String insEst = null;

  @SerializedName("endPes")
  private String endPes = null;

  @SerializedName("nroCno")
  private String nroCno = null;

  @SerializedName("prxEnd")
  private String prxEnd = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("faxRes")
  private String faxRes = null;

  @SerializedName("emaRes")
  private String emaRes = null;

  @SerializedName("excluido")
  private Boolean excluido = null;

  @SerializedName("indEnt")
  private Boolean indEnt = null;

  @SerializedName("indOba")
  private EnumIndOba indOba = null;

  @SerializedName("sitEnd")
  private EnumSitReg sitEnd = null;

  @SerializedName("dthalt")
  private OffsetDateTime dthalt = null;

  @SerializedName("e007ufs")
  private E007ufs e007ufs = null;

  @SerializedName("tipPes")
  private EnumJurFis tipPes = null;

  @SerializedName("usuger")
  private String usuger = null;

  @SerializedName("cplEnd")
  private String cplEnd = null;

  @SerializedName("nomRes")
  private String nomRes = null;

  @SerializedName("nenEnd")
  private String nenEnd = null;

  @SerializedName("baiEnd")
  private String baiEnd = null;

  @SerializedName("e008rai")
  private E008rai e008rai = null;

  @SerializedName("e006pai")
  private E006pai e006pai = null;

  @SerializedName("indCob")
  private Boolean indCob = null;

  public E001end usualt(String usualt) {
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

  public E001end dthger(OffsetDateTime dthger) {
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

  public E001end cnpCpf(String cnpCpf) {
    this.cnpCpf = cnpCpf;
    return this;
  }

   /**
   * CNPJ/CPF
   * @return cnpCpf
  **/
  @ApiModelProperty(value = "CNPJ/CPF")
  public String getCnpCpf() {
    return cnpCpf;
  }

  public void setCnpCpf(String cnpCpf) {
    this.cnpCpf = cnpCpf;
  }

  public E001end e008cep(E008cep e008cep) {
    this.e008cep = e008cep;
    return this;
  }

   /**
   * Get e008cep
   * @return e008cep
  **/
  @ApiModelProperty(value = "")
  public E008cep getE008cep() {
    return e008cep;
  }

  public void setE008cep(E008cep e008cep) {
    this.e008cep = e008cep;
  }

  public E001end fonRes(String fonRes) {
    this.fonRes = fonRes;
    return this;
  }

   /**
   * Telefone
   * @return fonRes
  **/
  @ApiModelProperty(value = "Telefone")
  public String getFonRes() {
    return fonRes;
  }

  public void setFonRes(String fonRes) {
    this.fonRes = fonRes;
  }

  public E001end celRes(String celRes) {
    this.celRes = celRes;
    return this;
  }

   /**
   * Celular
   * @return celRes
  **/
  @ApiModelProperty(value = "Celular")
  public String getCelRes() {
    return celRes;
  }

  public void setCelRes(String celRes) {
    this.celRes = celRes;
  }

  public E001end e001pes(E001pes e001pes) {
    this.e001pes = e001pes;
    return this;
  }

   /**
   * Get e001pes
   * @return e001pes
  **/
  @ApiModelProperty(value = "")
  public E001pes getE001pes() {
    return e001pes;
  }

  public void setE001pes(E001pes e001pes) {
    this.e001pes = e001pes;
  }

  public E001end tipLoc(EnumTipEnd tipLoc) {
    this.tipLoc = tipLoc;
    return this;
  }

   /**
   * Get tipLoc
   * @return tipLoc
  **/
  @ApiModelProperty(value = "")
  public EnumTipEnd getTipLoc() {
    return tipLoc;
  }

  public void setTipLoc(EnumTipEnd tipLoc) {
    this.tipLoc = tipLoc;
  }

  public E001end insEst(String insEst) {
    this.insEst = insEst;
    return this;
  }

   /**
   * Inscrição estadual
   * @return insEst
  **/
  @ApiModelProperty(value = "Inscrição estadual")
  public String getInsEst() {
    return insEst;
  }

  public void setInsEst(String insEst) {
    this.insEst = insEst;
  }

  public E001end endPes(String endPes) {
    this.endPes = endPes;
    return this;
  }

   /**
   * Endereço
   * @return endPes
  **/
  @ApiModelProperty(value = "Endereço")
  public String getEndPes() {
    return endPes;
  }

  public void setEndPes(String endPes) {
    this.endPes = endPes;
  }

  public E001end nroCno(String nroCno) {
    this.nroCno = nroCno;
    return this;
  }

   /**
   * Número de inscrição do cadastro nacional de obra (CNO)
   * @return nroCno
  **/
  @ApiModelProperty(value = "Número de inscrição do cadastro nacional de obra (CNO)")
  public String getNroCno() {
    return nroCno;
  }

  public void setNroCno(String nroCno) {
    this.nroCno = nroCno;
  }

  public E001end prxEnd(String prxEnd) {
    this.prxEnd = prxEnd;
    return this;
  }

   /**
   * Ponto de referência
   * @return prxEnd
  **/
  @ApiModelProperty(value = "Ponto de referência")
  public String getPrxEnd() {
    return prxEnd;
  }

  public void setPrxEnd(String prxEnd) {
    this.prxEnd = prxEnd;
  }

  public E001end id(UUID id) {
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

  public E001end faxRes(String faxRes) {
    this.faxRes = faxRes;
    return this;
  }

   /**
   * Fax
   * @return faxRes
  **/
  @ApiModelProperty(value = "Fax")
  public String getFaxRes() {
    return faxRes;
  }

  public void setFaxRes(String faxRes) {
    this.faxRes = faxRes;
  }

  public E001end emaRes(String emaRes) {
    this.emaRes = emaRes;
    return this;
  }

   /**
   * E-mail
   * @return emaRes
  **/
  @ApiModelProperty(value = "E-mail")
  public String getEmaRes() {
    return emaRes;
  }

  public void setEmaRes(String emaRes) {
    this.emaRes = emaRes;
  }

  public E001end excluido(Boolean excluido) {
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

  public E001end indEnt(Boolean indEnt) {
    this.indEnt = indEnt;
    return this;
  }

   /**
   * Indicativo se o endereço é utilizado para entrega
   * @return indEnt
  **/
  @ApiModelProperty(value = "Indicativo se o endereço é utilizado para entrega")
  public Boolean isIndEnt() {
    return indEnt;
  }

  public void setIndEnt(Boolean indEnt) {
    this.indEnt = indEnt;
  }

  public E001end indOba(EnumIndOba indOba) {
    this.indOba = indOba;
    return this;
  }

   /**
   * Get indOba
   * @return indOba
  **/
  @ApiModelProperty(value = "")
  public EnumIndOba getIndOba() {
    return indOba;
  }

  public void setIndOba(EnumIndOba indOba) {
    this.indOba = indOba;
  }

  public E001end sitEnd(EnumSitReg sitEnd) {
    this.sitEnd = sitEnd;
    return this;
  }

   /**
   * Get sitEnd
   * @return sitEnd
  **/
  @ApiModelProperty(value = "")
  public EnumSitReg getSitEnd() {
    return sitEnd;
  }

  public void setSitEnd(EnumSitReg sitEnd) {
    this.sitEnd = sitEnd;
  }

  public E001end dthalt(OffsetDateTime dthalt) {
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

  public E001end e007ufs(E007ufs e007ufs) {
    this.e007ufs = e007ufs;
    return this;
  }

   /**
   * Get e007ufs
   * @return e007ufs
  **/
  @ApiModelProperty(value = "")
  public E007ufs getE007ufs() {
    return e007ufs;
  }

  public void setE007ufs(E007ufs e007ufs) {
    this.e007ufs = e007ufs;
  }

  public E001end tipPes(EnumJurFis tipPes) {
    this.tipPes = tipPes;
    return this;
  }

   /**
   * Get tipPes
   * @return tipPes
  **/
  @ApiModelProperty(value = "")
  public EnumJurFis getTipPes() {
    return tipPes;
  }

  public void setTipPes(EnumJurFis tipPes) {
    this.tipPes = tipPes;
  }

  public E001end usuger(String usuger) {
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

  public E001end cplEnd(String cplEnd) {
    this.cplEnd = cplEnd;
    return this;
  }

   /**
   * Complemento
   * @return cplEnd
  **/
  @ApiModelProperty(value = "Complemento")
  public String getCplEnd() {
    return cplEnd;
  }

  public void setCplEnd(String cplEnd) {
    this.cplEnd = cplEnd;
  }

  public E001end nomRes(String nomRes) {
    this.nomRes = nomRes;
    return this;
  }

   /**
   * Nome do responsável
   * @return nomRes
  **/
  @ApiModelProperty(value = "Nome do responsável")
  public String getNomRes() {
    return nomRes;
  }

  public void setNomRes(String nomRes) {
    this.nomRes = nomRes;
  }

  public E001end nenEnd(String nenEnd) {
    this.nenEnd = nenEnd;
    return this;
  }

   /**
   * Número
   * @return nenEnd
  **/
  @ApiModelProperty(value = "Número")
  public String getNenEnd() {
    return nenEnd;
  }

  public void setNenEnd(String nenEnd) {
    this.nenEnd = nenEnd;
  }

  public E001end baiEnd(String baiEnd) {
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

  public E001end e008rai(E008rai e008rai) {
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

  public E001end e006pai(E006pai e006pai) {
    this.e006pai = e006pai;
    return this;
  }

   /**
   * Get e006pai
   * @return e006pai
  **/
  @ApiModelProperty(value = "")
  public E006pai getE006pai() {
    return e006pai;
  }

  public void setE006pai(E006pai e006pai) {
    this.e006pai = e006pai;
  }

  public E001end indCob(Boolean indCob) {
    this.indCob = indCob;
    return this;
  }

   /**
   * Indicativo se o endereço é utilizado para cobrança
   * @return indCob
  **/
  @ApiModelProperty(value = "Indicativo se o endereço é utilizado para cobrança")
  public Boolean isIndCob() {
    return indCob;
  }

  public void setIndCob(Boolean indCob) {
    this.indCob = indCob;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    E001end e001end = (E001end) o;
    return Objects.equals(this.usualt, e001end.usualt) &&
        Objects.equals(this.dthger, e001end.dthger) &&
        Objects.equals(this.cnpCpf, e001end.cnpCpf) &&
        Objects.equals(this.e008cep, e001end.e008cep) &&
        Objects.equals(this.fonRes, e001end.fonRes) &&
        Objects.equals(this.celRes, e001end.celRes) &&
        Objects.equals(this.e001pes, e001end.e001pes) &&
        Objects.equals(this.tipLoc, e001end.tipLoc) &&
        Objects.equals(this.insEst, e001end.insEst) &&
        Objects.equals(this.endPes, e001end.endPes) &&
        Objects.equals(this.nroCno, e001end.nroCno) &&
        Objects.equals(this.prxEnd, e001end.prxEnd) &&
        Objects.equals(this.id, e001end.id) &&
        Objects.equals(this.faxRes, e001end.faxRes) &&
        Objects.equals(this.emaRes, e001end.emaRes) &&
        Objects.equals(this.excluido, e001end.excluido) &&
        Objects.equals(this.indEnt, e001end.indEnt) &&
        Objects.equals(this.indOba, e001end.indOba) &&
        Objects.equals(this.sitEnd, e001end.sitEnd) &&
        Objects.equals(this.dthalt, e001end.dthalt) &&
        Objects.equals(this.e007ufs, e001end.e007ufs) &&
        Objects.equals(this.tipPes, e001end.tipPes) &&
        Objects.equals(this.usuger, e001end.usuger) &&
        Objects.equals(this.cplEnd, e001end.cplEnd) &&
        Objects.equals(this.nomRes, e001end.nomRes) &&
        Objects.equals(this.nenEnd, e001end.nenEnd) &&
        Objects.equals(this.baiEnd, e001end.baiEnd) &&
        Objects.equals(this.e008rai, e001end.e008rai) &&
        Objects.equals(this.e006pai, e001end.e006pai) &&
        Objects.equals(this.indCob, e001end.indCob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usualt, dthger, cnpCpf, e008cep, fonRes, celRes, e001pes, tipLoc, insEst, endPes, nroCno, prxEnd, id, faxRes, emaRes, excluido, indEnt, indOba, sitEnd, dthalt, e007ufs, tipPes, usuger, cplEnd, nomRes, nenEnd, baiEnd, e008rai, e006pai, indCob);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class E001end {\n");
    
    sb.append("    usualt: ").append(toIndentedString(usualt)).append("\n");
    sb.append("    dthger: ").append(toIndentedString(dthger)).append("\n");
    sb.append("    cnpCpf: ").append(toIndentedString(cnpCpf)).append("\n");
    sb.append("    e008cep: ").append(toIndentedString(e008cep)).append("\n");
    sb.append("    fonRes: ").append(toIndentedString(fonRes)).append("\n");
    sb.append("    celRes: ").append(toIndentedString(celRes)).append("\n");
    sb.append("    e001pes: ").append(toIndentedString(e001pes)).append("\n");
    sb.append("    tipLoc: ").append(toIndentedString(tipLoc)).append("\n");
    sb.append("    insEst: ").append(toIndentedString(insEst)).append("\n");
    sb.append("    endPes: ").append(toIndentedString(endPes)).append("\n");
    sb.append("    nroCno: ").append(toIndentedString(nroCno)).append("\n");
    sb.append("    prxEnd: ").append(toIndentedString(prxEnd)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    faxRes: ").append(toIndentedString(faxRes)).append("\n");
    sb.append("    emaRes: ").append(toIndentedString(emaRes)).append("\n");
    sb.append("    excluido: ").append(toIndentedString(excluido)).append("\n");
    sb.append("    indEnt: ").append(toIndentedString(indEnt)).append("\n");
    sb.append("    indOba: ").append(toIndentedString(indOba)).append("\n");
    sb.append("    sitEnd: ").append(toIndentedString(sitEnd)).append("\n");
    sb.append("    dthalt: ").append(toIndentedString(dthalt)).append("\n");
    sb.append("    e007ufs: ").append(toIndentedString(e007ufs)).append("\n");
    sb.append("    tipPes: ").append(toIndentedString(tipPes)).append("\n");
    sb.append("    usuger: ").append(toIndentedString(usuger)).append("\n");
    sb.append("    cplEnd: ").append(toIndentedString(cplEnd)).append("\n");
    sb.append("    nomRes: ").append(toIndentedString(nomRes)).append("\n");
    sb.append("    nenEnd: ").append(toIndentedString(nenEnd)).append("\n");
    sb.append("    baiEnd: ").append(toIndentedString(baiEnd)).append("\n");
    sb.append("    e008rai: ").append(toIndentedString(e008rai)).append("\n");
    sb.append("    e006pai: ").append(toIndentedString(e006pai)).append("\n");
    sb.append("    indCob: ").append(toIndentedString(indCob)).append("\n");
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

