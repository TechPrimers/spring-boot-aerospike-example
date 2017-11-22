package com.techprimers.springbootaerospikeexample.repository;

import com.techprimers.springbootaerospikeexample.model.User;
import org.springframework.data.aerospike.repository.AerospikeRepository;

public interface UserRepository extends AerospikeRepository<User, Integer> {
}
