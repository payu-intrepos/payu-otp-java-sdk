/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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

/**
 * VerifyOTPRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T16:48:59.560513+05:30[Asia/Kolkata]")
public class VerifyOTPRequest {
  public static final String SERIALIZED_NAME_MOBILE_NUMBER = "mobileNumber";
  @SerializedName(SERIALIZED_NAME_MOBILE_NUMBER)
  private String mobileNumber;

  public static final String SERIALIZED_NAME_OTP = "otp";
  @SerializedName(SERIALIZED_NAME_OTP)
  private Integer otp;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;


  public VerifyOTPRequest mobileNumber(String mobileNumber) {
    
    this.mobileNumber = mobileNumber;
    return this;
  }

   /**
   * Mobile Number should be same as send OTP Request
   * @return mobileNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9999999999", value = "Mobile Number should be same as send OTP Request")

  public String getMobileNumber() {
    return mobileNumber;
  }


  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }


  public VerifyOTPRequest otp(Integer otp) {
    
    this.otp = otp;
    return this;
  }

   /**
   * OTP received from send OTP Request
   * @return otp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "237613", value = "OTP received from send OTP Request")

  public Integer getOtp() {
    return otp;
  }


  public void setOtp(Integer otp) {
    this.otp = otp;
  }


  public VerifyOTPRequest uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID received from send OTP Request
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "21312122312323", value = "UUID received from send OTP Request")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyOTPRequest verifyOTPRequest = (VerifyOTPRequest) o;
    return Objects.equals(this.mobileNumber, verifyOTPRequest.mobileNumber) &&
        Objects.equals(this.otp, verifyOTPRequest.otp) &&
        Objects.equals(this.uuid, verifyOTPRequest.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobileNumber, otp, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyOTPRequest {\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    otp: ").append(toIndentedString(otp)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

