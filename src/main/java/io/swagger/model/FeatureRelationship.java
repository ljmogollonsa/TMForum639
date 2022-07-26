package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TimePeriod;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Configuration feature
 */
@ApiModel(description = "Configuration feature")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-03T01:38:50.932Z")


public class FeatureRelationship   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("relationshipType")
  private String relationshipType = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  public FeatureRelationship id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the target feature.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the target feature.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FeatureRelationship name(String name) {
    this.name = name;
    return this;
  }

  /**
   * This is the name of the target feature.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "This is the name of the target feature.")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeatureRelationship relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * This is the type of the feature relationship.
   * @return relationshipType
  **/
  @ApiModelProperty(required = true, value = "This is the type of the feature relationship.")
  @NotNull


  public String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  public FeatureRelationship validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The period for which this feature relationship is valid.
   * @return validFor
  **/
  @ApiModelProperty(value = "The period for which this feature relationship is valid.")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureRelationship featureRelationship = (FeatureRelationship) o;
    return Objects.equals(this.id, featureRelationship.id) &&
        Objects.equals(this.name, featureRelationship.name) &&
        Objects.equals(this.relationshipType, featureRelationship.relationshipType) &&
        Objects.equals(this.validFor, featureRelationship.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, relationshipType, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureRelationship {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

