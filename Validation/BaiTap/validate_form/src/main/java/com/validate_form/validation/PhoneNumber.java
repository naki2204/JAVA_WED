package com.validate_form.validation;

import org.hibernate.annotations.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
//
//@Documented
//@Constraint(validatedBy = PhoneNumberValidator.class)
//@Target({ElementType.METHOD, ElementType.FIELD})
//@Retention(RetentionPolicy.RUNTIME)
//public @interface PhoneNumber {
//    // trường message là bắt buộc, khai báo nội dung sẽ trả về khi field k hợp lệ
//    String message() default "LodaId must start with loda://";
//    // Cái này là bắt buộc phải có để Hibernate Validator có thể hoạt động
//    Class<?>[] groups() default {};
//    // Cái này là bắt buộc phải có để Hibernate Validator có thể hoạt động
//    Class<? extends Payload>[] payload() default {};
//}
