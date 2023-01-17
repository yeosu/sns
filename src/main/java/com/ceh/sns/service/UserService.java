package com.ceh.sns.service;

import com.ceh.sns.exception.SnsApplicationException;
import com.ceh.sns.model.User;
import com.ceh.sns.model.entity.UserEntity;
import com.ceh.sns.repository.UserEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserEntityRepository userEntityRepository;

    //TODO : implement
    public User join(String userName, String password){
        //가입하려는 이름으로 이미 가입된 user가 있는지
        Optional<UserEntity> userEntity = userEntityRepository.findByUserName(userName);

        //회원가입 진행 = user 등록
        userEntityRepository.save(new UserEntity());

        return new User();
    }

    //TODO : implement
    public String login(String userName, String password){
        //회원가입 여부 체크
        UserEntity userEntity = userEntityRepository.findByUserName(userName).orElseThrow(() -> new SnsApplicationException());

        //비밀번호 체크
        if(!userEntity.getPassword().equals(password)) {
            throw new SnsApplicationException();
        }

        //토큰 생성
        return "";
    }
}