package com.example.emodiary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {
    TextView loginRedirectText;
    Button signupButton;

        /**EditText signupName, signupUsername, signupEmail, signupPassword;

        Button signupButton;

        FirebaseAuth fAuth;
        FirebaseFirestore fStore;
        String userID;**/


    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register);

        loginRedirectText = findViewById(R.id.loginRedirectText);
        signupButton = findViewById(R.id.signup_button);

            /**signupName = findViewById(R.id.signup_name);
            signupEmail = findViewById(R.id.signup_email);
            signupUsername = findViewById(R.id.signup_username);
            signupPassword = findViewById(R.id.signup_password);
            loginRedirectText = findViewById(R.id.loginRedirectText);
            signupButton = findViewById(R.id.signup_button);

            fAuth = FirebaseAuth.getInstance();
            fStore = FirebaseFirestore.getInstance();

            signupButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {



                    String name = signupName.getText().toString();
                    String email = signupEmail.getText().toString();
                    String username = signupUsername.getText().toString();
                    String password = signupPassword.getText().toString();

                    //validate fields
                    if(TextUtils.isEmpty(email)){
                        signupEmail.setError("Email is Required.");
                        return;
                    }

                    if(TextUtils.isEmpty(password)){
                        signupPassword.setError("Password is Required.");
                        return;
                    }

                    if(password.length() < 6){
                        signupPassword.setError("Password Must be >= 6 Characters");
                        return;
                    }

                    //Login with firebase
                    fAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){





                                Toast.makeText(Register.this, "User Created.", Toast.LENGTH_SHORT).show();
                                userID = fAuth.getCurrentUser().getUid();
                                DocumentReference documentReference = fStore.collection("users").document(userID);
                                Map<String,Object> user = new HashMap<>();
                                user.put("fName",name);
                                user.put("email",email);
                                user.put("username",username);
                                documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                                    @Override
                                    public void onSuccess(Void aVoid) {
                                        Log.d(TAG, "onSuccess: User Profile is created for "+ userID);
                                    }
                                }).addOnFailureListener(new OnFailureListener() {
                                    @Override
                                    public void onFailure(@NonNull Exception e) {
                                        Log.d(TAG, "onFailure: " + e.toString());
                                    }
                                });
                                startActivity(new Intent(getApplicationContext(),Login.class));

                            }else {
                                Toast.makeText(Register.this, "Error ! " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            });**/


            signupButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), Login.class);
                    startActivity(intent);
                }
            });

            //redirect to sign up page
            loginRedirectText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Register.this, Login.class);
                    startActivity(intent);
                }
            });
        }
    }