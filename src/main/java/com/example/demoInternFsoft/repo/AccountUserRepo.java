package com.example.demoInternFsoft.repo;

import com.example.demoInternFsoft.model.AccountUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountUserRepo extends JpaRepository<AccountUser, String> {
    AccountUser findByAccount(String account);
    AccountUser findByEmail(String email);
    AccountUser findByMobile(String mobile);
    AccountUser findByAccountAndEmail(String account, String email);
    AccountUser findByAccountAndMobile(String account, String mobile);
    AccountUser findByEmailAndMobile(String email, String mobile);
    AccountUser findByAccountAndEmailAndMobile(String account, String email, String mobile);
    AccountUser findByAccountAndEmailAndMobileAndIsAuthentication(String account, String email, String mobile, boolean isAuthentication);
    AccountUser findByAccountAndEmailAndMobileAndIsAuthenticationAndIsDelete(String account, String email, String mobile, boolean isAuthentication, boolean isDelete);
    AccountUser findByAccountAndEmailAndMobileAndIsAuthenticationAndIsDeleteAndState(String account, String email, String mobile, boolean isAuthentication, boolean isDelete, String state);
    AccountUser findByAccountAndEmailAndMobileAndIsAuthenticationAndIsDeleteAndStateAndGender(String account, String email, String mobile, boolean isAuthentication, boolean isDelete, String state, int gender);

}