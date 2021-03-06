/*
 * This file is part of the RADA prototype.
 * 
 * Copyright (C) 2013 University of Minnesota 
 * See file COPYING in the top-level source directory for licensing information 
 */

package rada;

enum ResultType {
  SAT, UNSAT, ERROR, UNKNOWN  
}

public class SolverResult {
  private String rawResult;
  private ResultType type;
  
  public SolverResult(String r, ResultType t) {
    rawResult = r;
    type = t;
  }
  
  public SolverResult(ResultType t) {
    rawResult = "";
    type = t;
  }
  
  public String getRawResult() {
    return rawResult;    
  }
  
  public ResultType getType() {
    return type;
  }
  
  @Override
  public String toString() {
    if (type == ResultType.SAT) {
      return Constant.SAT;
    } else if (type == ResultType.UNSAT) {
      return Constant.UNSAT;
    } else if (type == ResultType.ERROR) {
      return Constant.ERROR;
    } else {
      return Constant.UNKNOWN; 
    }
  }
}