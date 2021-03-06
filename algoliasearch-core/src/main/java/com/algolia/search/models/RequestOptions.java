package com.algolia.search.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;

/**
 * Request options are used to pass extra parameters, headers, timeout to the request. Parameters
 * set in the request option will override default parameter.
 */
public class RequestOptions implements Serializable {

  private final Map<String, String> headers = new HashMap<>();
  private final Map<String, String> queryParams = new HashMap<>();
  private Integer timeout = null;

  public RequestOptions addExtraHeader(@Nonnull String key, @Nonnull String value) {
    headers.put(key, value);
    return this;
  }

  public RequestOptions addExtraQueryParameters(@Nonnull String key, @Nonnull String value) {
    queryParams.put(key, value);
    return this;
  }

  public Map<String, String> getExtraHeaders() {
    return headers;
  }

  public Map<String, String> getExtraQueryParams() {
    return queryParams;
  }

  public Integer getTimeout() {
    return timeout;
  }

  public RequestOptions setTimeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

  @Override
  public String toString() {
    return "RequestOptions{" + "headers=" + headers + ", queryParams=" + queryParams + '\'' + '}';
  }
}
