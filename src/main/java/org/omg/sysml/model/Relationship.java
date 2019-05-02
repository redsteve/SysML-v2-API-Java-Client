/*
 * SysML v2 API and Services
 * REST/HTTP binding (PSM) for the SysML v2 standard API.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.omg.sysml.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.omg.sysml.model.Element;

/**
 * Relationship
 */

public class Relationship extends Element {
  public static final String SERIALIZED_NAME_SOURCE_ELEMENT_ROLE = "source_element_role";
  @SerializedName(SERIALIZED_NAME_SOURCE_ELEMENT_ROLE)
  private String sourceElementRole;

  public static final String SERIALIZED_NAME_SOURCE_ELEMENT = "source_element";
  @SerializedName(SERIALIZED_NAME_SOURCE_ELEMENT)
  private UUID sourceElement;

  public static final String SERIALIZED_NAME_TARGET_ELEMENT_ROLE = "target_element_role";
  @SerializedName(SERIALIZED_NAME_TARGET_ELEMENT_ROLE)
  private String targetElementRole;

  public static final String SERIALIZED_NAME_TARGET_ELEMENT = "target_element";
  @SerializedName(SERIALIZED_NAME_TARGET_ELEMENT)
  private UUID targetElement;

  public Relationship sourceElementRole(String sourceElementRole) {
    this.sourceElementRole = sourceElementRole;
    return this;
  }

   /**
   * Get sourceElementRole
   * @return sourceElementRole
  **/
  @ApiModelProperty(value = "")
  public String getSourceElementRole() {
    return sourceElementRole;
  }

  public void setSourceElementRole(String sourceElementRole) {
    this.sourceElementRole = sourceElementRole;
  }

  public Relationship sourceElement(UUID sourceElement) {
    this.sourceElement = sourceElement;
    return this;
  }

   /**
   * Get sourceElement
   * @return sourceElement
  **/
  @ApiModelProperty(value = "")
  public UUID getSourceElement() {
    return sourceElement;
  }

  public void setSourceElement(UUID sourceElement) {
    this.sourceElement = sourceElement;
  }

  public Relationship targetElementRole(String targetElementRole) {
    this.targetElementRole = targetElementRole;
    return this;
  }

   /**
   * Get targetElementRole
   * @return targetElementRole
  **/
  @ApiModelProperty(value = "")
  public String getTargetElementRole() {
    return targetElementRole;
  }

  public void setTargetElementRole(String targetElementRole) {
    this.targetElementRole = targetElementRole;
  }

  public Relationship targetElement(UUID targetElement) {
    this.targetElement = targetElement;
    return this;
  }

   /**
   * Get targetElement
   * @return targetElement
  **/
  @ApiModelProperty(value = "")
  public UUID getTargetElement() {
    return targetElement;
  }

  public void setTargetElement(UUID targetElement) {
    this.targetElement = targetElement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Relationship relationship = (Relationship) o;
    return Objects.equals(this.sourceElementRole, relationship.sourceElementRole) &&
        Objects.equals(this.sourceElement, relationship.sourceElement) &&
        Objects.equals(this.targetElementRole, relationship.targetElementRole) &&
        Objects.equals(this.targetElement, relationship.targetElement) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceElementRole, sourceElement, targetElementRole, targetElement, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Relationship {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sourceElementRole: ").append(toIndentedString(sourceElementRole)).append("\n");
    sb.append("    sourceElement: ").append(toIndentedString(sourceElement)).append("\n");
    sb.append("    targetElementRole: ").append(toIndentedString(targetElementRole)).append("\n");
    sb.append("    targetElement: ").append(toIndentedString(targetElement)).append("\n");
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
