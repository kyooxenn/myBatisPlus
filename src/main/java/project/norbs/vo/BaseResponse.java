package project.norbs.vo;

/**
 * empty response for all response as super class
 */
public interface BaseResponse {
    /** if controller return this, http status will be 204 (no content) */
    BaseResponse EMPTY = new BaseResponse() {};
    /** if controller return this, http status will be 201 (created) */
    BaseResponse CREATED = new BaseResponse() {};
}
