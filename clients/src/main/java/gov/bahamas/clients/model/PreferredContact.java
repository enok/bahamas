/*
 * Clients
 * <table><thead><tr><th>Version</th><th>Author</th><th>Date</th><th>Description</th><th>Revision by</th></tr></thead><tbody><tr><td>1.0.0</td><td>Enok</td><td>2022-01-09</td><td>Creates a new client (POST)</td><td> - </td></tr></tbody></table>
 *
 * The version of the OpenAPI document: 1;2022-01-09
 * Contact: enok.jesus@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package gov.bahamas.clients.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * The preferred contact details.
 */
@ApiModel(description = "The preferred contact details.")
@JsonPropertyOrder({
  PreferredContact.JSON_PROPERTY_NAME,
  PreferredContact.JSON_PROPERTY_EMAIL,
  PreferredContact.JSON_PROPERTY_PHONE
})
@JsonTypeName("preferred_contact")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PreferredContact {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private String phone;


  public PreferredContact name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the preferred contact on your new client.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Bruce Norris", value = "Name of the preferred contact on your new client.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PreferredContact email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email of the preferred contact on your new client.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "email@invoicexpress.com", value = "Email of the preferred contact on your new client.")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public PreferredContact phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Phone number of the preferred contact on your new client.
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "213456789", value = "Phone number of the preferred contact on your new client.")
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o, false, null, true);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreferredContact {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

