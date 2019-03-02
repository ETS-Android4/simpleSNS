package org.simplesns.simplesns.activity.main.profile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.simplesns.simplesns.GlobalUser;
import org.simplesns.simplesns.R;

import de.hdodenhof.circleimageview.CircleImageView;
/*
폴더를 어떻게 구성하는건지 몰라서 일단 밖으로 빼놓고 구현했습니다.
문제가 있을 경우 조언 부탁드립니다.
 */

public class ProfileChangeActivity extends AppCompatActivity {
    ImageView btnClose;
    ImageView btnSave;
    CircleImageView ivProfilePhoto;
    TextView tvProfilePhoto;
    EditText etName;
    EditText etUsername;
    EditText etIntroduction;
    EditText etEmail;
    EditText etPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_change);

//        체크나 X 버튼을 누르면 ProfileFragment.java(fragment_profile.xml) 파일로 돌아감
        btnClose = (ImageView)findViewById(R.id.btn_close);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnSave = (ImageView)findViewById(R.id.btn_save);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String new_name = etName.getText().toString();
                String new_username = etUsername.getText().toString();
                String new_introduction = etIntroduction.getText().toString();
                // TODO : 수정한 내용 저장해야 함.  서버로 저장하나?
                finish();
            }
        });

        ivProfilePhoto = (CircleImageView)findViewById(R.id.iv_profile_photo);
        ivProfilePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO : 프로필 이미지 바꾸는 코드 작성하기
            }
        });
        tvProfilePhoto = (TextView)findViewById(R.id.tv_profile_photo);
        tvProfilePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO : 프로필 이미지 바꾸는 코드 작성하기
            }
        });

        // TODO : 서버에서 받은 값으로 설정하기
        etName = (EditText)findViewById(R.id.et_name);
//        et_name.setText("");

        etUsername = (EditText)findViewById(R.id.et_username);
        etUsername.setText(GlobalUser.getInstance().getMyId());

        etIntroduction = (EditText)findViewById(R.id.et_introduction);
//        et_introduction.setText("");

        etEmail= (EditText)findViewById(R.id.et_email);
//        et_email.setText("");

        etPhone = (EditText)findViewById(R.id.et_phone);
//        et_phone.setText("");
    }
}