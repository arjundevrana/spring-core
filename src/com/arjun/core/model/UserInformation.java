/**
 * @author Arjun singh
 */
package com.arjun.core.model;

import java.io.Serializable;

/**
 * @version 4.3.0
 * @since Aug 2016 This is simple pojo class
 */
public class UserInformation implements Serializable {

  /**
   * This auto generate runtime associates with each serializable class a version number.
   */
  private static final long serialVersionUID = 1272625388089526096L;
  private String userName;
  private String userID;
  /**
   * This is parameter constructor to inject dependency by constructor base.
   * It take two string parameter as argument userName and userID and return 
   * Configurable object.
   * @param userName
   * @param userID
   */
  public UserInformation(String userName, String userID) {
    this.userName = userName;
    this.userID = userID;
  }
  /* Simple to string method to use print object in string format.
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "UserInformation [userName=" + userName + ", userID=" + userID + "]";
  }

 

}
