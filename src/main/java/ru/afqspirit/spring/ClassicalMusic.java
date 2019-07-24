package ru.afqspirit.spring;

public class ClassicalMusic implements Music{
    private ClassicalMusic(){}

    public  static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Делаю мою инициализацию");
    }

    public void doMyDestroy(){
        System.out.println("Совершаю уничтожение этого бина");
    }


    @Override
    public String getSong(){
        return "Bohemian Rhapsody";
    }
}
