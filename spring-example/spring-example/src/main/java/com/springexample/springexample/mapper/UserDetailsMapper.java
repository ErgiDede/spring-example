package com.springexample.springexample.mapper;

import com.springexample.springexample.model.dto.UserDetailsDTO;
import com.springexample.springexample.model.entity.UserDetails;


public class UserDetailsMapper  extends AbstractMapper<UserDetails, UserDetailsDTO>{

    @Override
    public UserDetails toEntity(UserDetailsDTO userDetailsDTO) {

        UserDetails userDetails = new UserDetails();
        userDetails.setId(userDetailsDTO.getId());
        userDetails.setFirstName(userDetailsDTO.getFirstName());
        userDetails.setLastName(userDetailsDTO.getLastName());
        userDetails.setEmail(userDetailsDTO.getEmail());
        userDetails.setPhoneNumber(userDetailsDTO.getPhoneNumber());
        return null;
    }


    @Override
    public UserDetailsDTO toDto(UserDetails userDetails){
        UserDetailsDTO userDetailsDTO = new UserDetailsDTO();
        userDetailsDTO.setId(userDetails.getId());
        userDetailsDTO.setFirstName(userDetails.getFirstName());
        userDetailsDTO.setLastName(userDetails.getLastName());
        userDetailsDTO.setEmail(userDetails.getEmail());
        userDetailsDTO.setPhoneNumber(userDetails.getPhoneNumber());

        return userDetailsDTO;

    }
}
