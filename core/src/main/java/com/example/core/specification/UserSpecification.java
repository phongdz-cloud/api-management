package com.example.core.specification;

import com.example.common.dto.UserSearchCriteria;
import com.example.common.util.StringUtil;
import com.example.core.entity.User;
import jakarta.persistence.criteria.Predicate;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

public class UserSpecification {

    public static Specification<User> build(UserSearchCriteria criteria) {
        return (root, query, cb) -> {
            List<Predicate> predicates = new ArrayList<>();
            if (StringUtils.isNotEmpty(criteria.getUsername())) {
                predicates.add(cb.like(cb.lower(root.get("username")), "%" + criteria.getUsername().toLowerCase() + "%"));
            }
            if (StringUtils.isNotEmpty(criteria.getEmail())) {
                predicates.add(cb.like(cb.lower(root.get("email")), "%" + criteria.getEmail().toLowerCase() + "%"));
            }
            if (criteria.getCreatedAtFrom() != null) {
                predicates.add(cb.greaterThanOrEqualTo(root.get("createdAt"), criteria.getCreatedAtFrom()));
            }
            if (criteria.getCreatedAtTo() != null) {
                predicates.add(cb.lessThanOrEqualTo(root.get("createdAt"), criteria.getCreatedAtTo()));
            }
            return cb.and(predicates.toArray(new Predicate[0]));
        };
    }
}
