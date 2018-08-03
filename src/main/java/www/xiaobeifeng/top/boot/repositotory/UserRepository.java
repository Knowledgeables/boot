package www.xiaobeifeng.top.boot.repositotory;


import org.springframework.data.jpa.repository.JpaRepository;

import www.xiaobeifeng.top.boot.entity.Users;

/**
 * Project :  boot.
 * Package name: www.xiaobeifeng.top.boot
 * Created by :  benjamin.
 * Created time: 2018/8/3 15:42
 * Changed by :  benjamin.
 * Changed time: 2018/8/3 15:42
 * Class description:
 */

public  interface UserRepository extends JpaRepository<Users, Integer> {



}
