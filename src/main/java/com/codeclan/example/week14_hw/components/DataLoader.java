package com.codeclan.example.week14_hw.components;
import com.codeclan.example.week14_hw.models.File;
import com.codeclan.example.week14_hw.models.Folder;
import com.codeclan.example.week14_hw.models.Person;
import com.codeclan.example.week14_hw.repositories.FileRepository;
import com.codeclan.example.week14_hw.repositories.FolderRepository;
import com.codeclan.example.week14_hw.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    public DataLoader(){
    }

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    PersonRepository personRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Person myPerson = new Person("Chris");
        personRepository.save(myPerson);
        Person slyPerson = new Person("Nathan");
        personRepository.save(slyPerson);
        Person flyPerson = new Person("PWise");
        personRepository.save(flyPerson);
        Folder folder1 = new Folder("Images", myPerson);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("Stuff", myPerson);
        folderRepository.save(folder2);
        Folder folder3 = new Folder("Movies", slyPerson);
        folderRepository.save(folder3);
        Folder folder4 = new Folder("Downloads", flyPerson);
        folderRepository.save(folder4);
        File file1 = new File("Yo yo texts", "txt", 15, folder1);
        fileRepository.save(file1);
        File file2 = new File("How to code bad", "txt", 37, folder2);
        fileRepository.save(file2);
        File file3 = new File("cats", "png", 86, folder3);
        fileRepository.save(file3);
        File file4 = new File("Some more things", "png", 1208, folder4);
        fileRepository.save(file4);
    }


}
