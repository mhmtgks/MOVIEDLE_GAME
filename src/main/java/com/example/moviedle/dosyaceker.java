package com.example.moviedle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dosyaceker {
    private   List<String> eleman = new ArrayList<String>();
    public dosyaceker() throws IOException {
        {
            String[] elemanlar = new String[250*8];
            String FilePath = "imdb_top_250.csv";
            BufferedReader reader =new BufferedReader(new FileReader(FilePath));
            String line="";
            int i =0;
            try{
                while((line = reader.readLine())!= null){
                    String[] row= line.split(";");
                    for(String index :row){
                        elemanlar[i]=index;
                        i++;
                    }
                }
            }catch(Exception e){
                Collections.addAll(eleman,elemanlar);
                System.out.println("okuma bitti");
            }finally{
                reader.close();
            }
        }
    }
    public  List<String> getEleman() {
        return eleman;
    }

    public int chooser(){
        int chosen;
        chosen = (int)(Math.random()*(250-0+1)+0);
        chosen=(chosen*9)-(chosen-1);
        System.out.println(getEleman().get(chosen));
        return chosen;
    }
    public int finder(String text){
        int i=8;
        int returner=0;
        String t1;
        for(i=17;i<2001;i++)
        {
            t1=eleman.get(i);
            if(t1.equals(text))
            {
                returner=i;
            }
            i=i+7;
        }
        return returner;
    }
    }
