package com.example.Spring_Study.repository;

import com.example.Spring_Study.entity.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository <Member, Long> {
}
