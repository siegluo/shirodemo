package com.ctrip.tour.pkgdemo.commom.validate;


import com.ctrip.tour.pkgdemo.commom.dto.ActResult;

/**
 * Created by xu_yanga on 2017/2/3.
 */
public abstract class AbstractValidator<TValidatorDto> {
    protected abstract ActResult validate(TValidatorDto validatorDto);
}
