package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AttachmentRefOrValue;
import io.swagger.model.Characteristic;
import io.swagger.model.Feature;
import io.swagger.model.Note;
import io.swagger.model.RelatedParty;
import io.swagger.model.RelatedPlaceRefOrValue;
import io.swagger.model.ResourceAdministrativeStateType;
import io.swagger.model.ResourceOperationalStateType;
import io.swagger.model.ResourceRelationship;
import io.swagger.model.ResourceSpecificationRef;
import io.swagger.model.ResourceStatusType;
import io.swagger.model.ResourceUsageStateType;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Logic resource is a type of resource that describes the common set of attributes shared by all concrete logical resources (e.g. TPE, MSISDN, IP Addresses) in the inventory.
 */
@ApiModel(description = "Logic resource is a type of resource that describes the common set of attributes shared by all concrete logical resources (e.g. TPE, MSISDN, IP Addresses) in the inventory.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-03T01:38:50.932Z")


public class LogicalResource   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("endOperatingDate")
  private OffsetDateTime endOperatingDate = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("resourceVersion")
  private String resourceVersion = null;

  @JsonProperty("startOperatingDate")
  private OffsetDateTime startOperatingDate = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("activationFeature")
  @Valid
  private List<Feature> activationFeature = null;

  @JsonProperty("administrativeState")
  private ResourceAdministrativeStateType administrativeState = null;

  @JsonProperty("attachment")
  @Valid
  private List<AttachmentRefOrValue> attachment = null;

  @JsonProperty("note")
  @Valid
  private List<Note> note = null;

  @JsonProperty("operationalState")
  private ResourceOperationalStateType operationalState = null;

  @JsonProperty("place")
  private RelatedPlaceRefOrValue place = null;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedParty> relatedParty = null;

  @JsonProperty("resourceCharacteristic")
  @Valid
  private List<Characteristic> resourceCharacteristic = null;

  @JsonProperty("resourceRelationship")
  @Valid
  private List<ResourceRelationship> resourceRelationship = null;

  @JsonProperty("resourceSpecification")
  private ResourceSpecificationRef resourceSpecification = null;

  @JsonProperty("resourceStatus")
  private ResourceStatusType resourceStatus = null;

  @JsonProperty("usageState")
  private ResourceUsageStateType usageState = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public LogicalResource id(String id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier
   * @return id
  **/
  @ApiModelProperty(required = true, value = "unique identifier")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LogicalResource href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference
   * @return href
  **/
  @ApiModelProperty(required = true, value = "Hyperlink reference")
  @NotNull


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public LogicalResource category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Category of the concrete resource. e.g Gold, Silver for MSISDN concrete resource
   * @return category
  **/
  @ApiModelProperty(value = "Category of the concrete resource. e.g Gold, Silver for MSISDN concrete resource")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public LogicalResource description(String description) {
    this.description = description;
    return this;
  }

  /**
   * free-text description of the resource
   * @return description
  **/
  @ApiModelProperty(value = "free-text description of the resource")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LogicalResource endOperatingDate(OffsetDateTime endOperatingDate) {
    this.endOperatingDate = endOperatingDate;
    return this;
  }

  /**
   * A date time( DateTime). The date till the resource is operating
   * @return endOperatingDate
  **/
  @ApiModelProperty(value = "A date time( DateTime). The date till the resource is operating")

  @Valid

  public OffsetDateTime getEndOperatingDate() {
    return endOperatingDate;
  }

  public void setEndOperatingDate(OffsetDateTime endOperatingDate) {
    this.endOperatingDate = endOperatingDate;
  }

  public LogicalResource name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A string used to give a name to the resource
   * @return name
  **/
  @ApiModelProperty(value = "A string used to give a name to the resource")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LogicalResource resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

  /**
   * A field that identifies the specific version of an instance of a resource.
   * @return resourceVersion
  **/
  @ApiModelProperty(value = "A field that identifies the specific version of an instance of a resource.")


  public String getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }

  public LogicalResource startOperatingDate(OffsetDateTime startOperatingDate) {
    this.startOperatingDate = startOperatingDate;
    return this;
  }

  /**
   * A date time( DateTime). The date from which the resource is operating
   * @return startOperatingDate
  **/
  @ApiModelProperty(value = "A date time( DateTime). The date from which the resource is operating")

  @Valid

  public OffsetDateTime getStartOperatingDate() {
    return startOperatingDate;
  }

  public void setStartOperatingDate(OffsetDateTime startOperatingDate) {
    this.startOperatingDate = startOperatingDate;
  }

  public LogicalResource value(String value) {
    this.value = value;
    return this;
  }

  /**
   * the value of the logical resource. E.g '0746712345' for  MSISDN's
   * @return value
  **/
  @ApiModelProperty(value = "the value of the logical resource. E.g '0746712345' for  MSISDN's")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public LogicalResource activationFeature(List<Feature> activationFeature) {
    this.activationFeature = activationFeature;
    return this;
  }

  public LogicalResource addActivationFeatureItem(Feature activationFeatureItem) {
    if (this.activationFeature == null) {
      this.activationFeature = new ArrayList<Feature>();
    }
    this.activationFeature.add(activationFeatureItem);
    return this;
  }

  /**
   * Configuration features
   * @return activationFeature
  **/
  @ApiModelProperty(value = "Configuration features")

  @Valid

  public List<Feature> getActivationFeature() {
    return activationFeature;
  }

  public void setActivationFeature(List<Feature> activationFeature) {
    this.activationFeature = activationFeature;
  }

  public LogicalResource administrativeState(ResourceAdministrativeStateType administrativeState) {
    this.administrativeState = administrativeState;
    return this;
  }

  /**
   * Tracks the lifecycle status of the resource, such as planning, installing, opereating, retiring and so on.
   * @return administrativeState
  **/
  @ApiModelProperty(value = "Tracks the lifecycle status of the resource, such as planning, installing, opereating, retiring and so on.")

  @Valid

  public ResourceAdministrativeStateType getAdministrativeState() {
    return administrativeState;
  }

  public void setAdministrativeState(ResourceAdministrativeStateType administrativeState) {
    this.administrativeState = administrativeState;
  }

  public LogicalResource attachment(List<AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
    return this;
  }

  public LogicalResource addAttachmentItem(AttachmentRefOrValue attachmentItem) {
    if (this.attachment == null) {
      this.attachment = new ArrayList<AttachmentRefOrValue>();
    }
    this.attachment.add(attachmentItem);
    return this;
  }

  /**
   * Get attachment
   * @return attachment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AttachmentRefOrValue> getAttachment() {
    return attachment;
  }

  public void setAttachment(List<AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
  }

  public LogicalResource note(List<Note> note) {
    this.note = note;
    return this;
  }

  public LogicalResource addNoteItem(Note noteItem) {
    if (this.note == null) {
      this.note = new ArrayList<Note>();
    }
    this.note.add(noteItem);
    return this;
  }

  /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Note> getNote() {
    return note;
  }

  public void setNote(List<Note> note) {
    this.note = note;
  }

  public LogicalResource operationalState(ResourceOperationalStateType operationalState) {
    this.operationalState = operationalState;
    return this;
  }

  /**
   * Tracks the lifecycle status of the resource, such as planning, installing, opereating, retiring and so on.
   * @return operationalState
  **/
  @ApiModelProperty(value = "Tracks the lifecycle status of the resource, such as planning, installing, opereating, retiring and so on.")

  @Valid

  public ResourceOperationalStateType getOperationalState() {
    return operationalState;
  }

  public void setOperationalState(ResourceOperationalStateType operationalState) {
    this.operationalState = operationalState;
  }

  public LogicalResource place(RelatedPlaceRefOrValue place) {
    this.place = place;
    return this;
  }

  /**
   * Get place
   * @return place
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelatedPlaceRefOrValue getPlace() {
    return place;
  }

  public void setPlace(RelatedPlaceRefOrValue place) {
    this.place = place;
  }

  public LogicalResource relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public LogicalResource addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedParty>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * Get relatedParty
   * @return relatedParty
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public LogicalResource resourceCharacteristic(List<Characteristic> resourceCharacteristic) {
    this.resourceCharacteristic = resourceCharacteristic;
    return this;
  }

  public LogicalResource addResourceCharacteristicItem(Characteristic resourceCharacteristicItem) {
    if (this.resourceCharacteristic == null) {
      this.resourceCharacteristic = new ArrayList<Characteristic>();
    }
    this.resourceCharacteristic.add(resourceCharacteristicItem);
    return this;
  }

  /**
   * Get resourceCharacteristic
   * @return resourceCharacteristic
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Characteristic> getResourceCharacteristic() {
    return resourceCharacteristic;
  }

  public void setResourceCharacteristic(List<Characteristic> resourceCharacteristic) {
    this.resourceCharacteristic = resourceCharacteristic;
  }

  public LogicalResource resourceRelationship(List<ResourceRelationship> resourceRelationship) {
    this.resourceRelationship = resourceRelationship;
    return this;
  }

  public LogicalResource addResourceRelationshipItem(ResourceRelationship resourceRelationshipItem) {
    if (this.resourceRelationship == null) {
      this.resourceRelationship = new ArrayList<ResourceRelationship>();
    }
    this.resourceRelationship.add(resourceRelationshipItem);
    return this;
  }

  /**
   * Get resourceRelationship
   * @return resourceRelationship
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ResourceRelationship> getResourceRelationship() {
    return resourceRelationship;
  }

  public void setResourceRelationship(List<ResourceRelationship> resourceRelationship) {
    this.resourceRelationship = resourceRelationship;
  }

  public LogicalResource resourceSpecification(ResourceSpecificationRef resourceSpecification) {
    this.resourceSpecification = resourceSpecification;
    return this;
  }

  /**
   * Get resourceSpecification
   * @return resourceSpecification
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceSpecificationRef getResourceSpecification() {
    return resourceSpecification;
  }

  public void setResourceSpecification(ResourceSpecificationRef resourceSpecification) {
    this.resourceSpecification = resourceSpecification;
  }

  public LogicalResource resourceStatus(ResourceStatusType resourceStatus) {
    this.resourceStatus = resourceStatus;
    return this;
  }

  /**
   * Tracks the lifecycle status of the resource, such as planning, installing, opereating, retiring and so on.
   * @return resourceStatus
  **/
  @ApiModelProperty(value = "Tracks the lifecycle status of the resource, such as planning, installing, opereating, retiring and so on.")

  @Valid

  public ResourceStatusType getResourceStatus() {
    return resourceStatus;
  }

  public void setResourceStatus(ResourceStatusType resourceStatus) {
    this.resourceStatus = resourceStatus;
  }

  public LogicalResource usageState(ResourceUsageStateType usageState) {
    this.usageState = usageState;
    return this;
  }

  /**
   * Tracks the lifecycle status of the resource, such as planning, installing, opereating, retiring and so on.
   * @return usageState
  **/
  @ApiModelProperty(value = "Tracks the lifecycle status of the resource, such as planning, installing, opereating, retiring and so on.")

  @Valid

  public ResourceUsageStateType getUsageState() {
    return usageState;
  }

  public void setUsageState(ResourceUsageStateType usageState) {
    this.usageState = usageState;
  }

  public LogicalResource baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return baseType
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public LogicalResource schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public LogicalResource type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return type
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class Extensible name")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogicalResource logicalResource = (LogicalResource) o;
    return Objects.equals(this.id, logicalResource.id) &&
        Objects.equals(this.href, logicalResource.href) &&
        Objects.equals(this.category, logicalResource.category) &&
        Objects.equals(this.description, logicalResource.description) &&
        Objects.equals(this.endOperatingDate, logicalResource.endOperatingDate) &&
        Objects.equals(this.name, logicalResource.name) &&
        Objects.equals(this.resourceVersion, logicalResource.resourceVersion) &&
        Objects.equals(this.startOperatingDate, logicalResource.startOperatingDate) &&
        Objects.equals(this.value, logicalResource.value) &&
        Objects.equals(this.activationFeature, logicalResource.activationFeature) &&
        Objects.equals(this.administrativeState, logicalResource.administrativeState) &&
        Objects.equals(this.attachment, logicalResource.attachment) &&
        Objects.equals(this.note, logicalResource.note) &&
        Objects.equals(this.operationalState, logicalResource.operationalState) &&
        Objects.equals(this.place, logicalResource.place) &&
        Objects.equals(this.relatedParty, logicalResource.relatedParty) &&
        Objects.equals(this.resourceCharacteristic, logicalResource.resourceCharacteristic) &&
        Objects.equals(this.resourceRelationship, logicalResource.resourceRelationship) &&
        Objects.equals(this.resourceSpecification, logicalResource.resourceSpecification) &&
        Objects.equals(this.resourceStatus, logicalResource.resourceStatus) &&
        Objects.equals(this.usageState, logicalResource.usageState) &&
        Objects.equals(this.baseType, logicalResource.baseType) &&
        Objects.equals(this.schemaLocation, logicalResource.schemaLocation) &&
        Objects.equals(this.type, logicalResource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, category, description, endOperatingDate, name, resourceVersion, startOperatingDate, value, activationFeature, administrativeState, attachment, note, operationalState, place, relatedParty, resourceCharacteristic, resourceRelationship, resourceSpecification, resourceStatus, usageState, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogicalResource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endOperatingDate: ").append(toIndentedString(endOperatingDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    startOperatingDate: ").append(toIndentedString(startOperatingDate)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    activationFeature: ").append(toIndentedString(activationFeature)).append("\n");
    sb.append("    administrativeState: ").append(toIndentedString(administrativeState)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    resourceCharacteristic: ").append(toIndentedString(resourceCharacteristic)).append("\n");
    sb.append("    resourceRelationship: ").append(toIndentedString(resourceRelationship)).append("\n");
    sb.append("    resourceSpecification: ").append(toIndentedString(resourceSpecification)).append("\n");
    sb.append("    resourceStatus: ").append(toIndentedString(resourceStatus)).append("\n");
    sb.append("    usageState: ").append(toIndentedString(usageState)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

