package com.stackroute.domain;


import org.springframework.stereotype.Component;

@Component
public class Actor{

        public Actor(String name,String gender,int age) {
            this.name = name;
            this.gender=gender;
            this.age=age;
        }

        public Actor() {
        }

        @Override
        public String toString() {
            return "Actor {" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", age=" + age +
                    '}';
        }

        private String name;
        private String gender;
        private int age;

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }


        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }



    }


