package com.vinay.movies;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

import com.vinay.movies.bean.MovieBean;

public class MovieFilter {
	
	public static void main(String[] args) {
		
		BufferedReader br = null;

		try {
			Hashtable<Integer, MovieBean> moviesTable=new Hashtable<Integer, MovieBean>();
			String sCurrentLine;

			br = new BufferedReader(new FileReader("C:/Users/Vinay Kumar/Desktop/Fragma_Data_Systems/ml-1m/ml-1m/movies.dat"));

			while ((sCurrentLine = br.readLine()) != null) {
				MovieBean mb=new MovieBean();
				mb.setMovieID(Integer.valueOf(sCurrentLine.split("::")[0]));
				mb.setTitle(sCurrentLine.split("::")[1]);
				mb.setGenres(sCurrentLine.split("::")[2]);
				moviesTable.put(mb.getMovieID(), mb);
			}
			
			
			System.out.println("Mvies list Size:::"+moviesTable.get(143).genres);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		
		//Ratings
		/*try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader("C:/Users/Vinay Kumar/Desktop/Fragma_Data_Systems/ml-1m/ml-1m/ratings.dat"));

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}*/
		
		//Users
		/*try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader("C:/Users/Vinay Kumar/Desktop/Fragma_Data_Systems/ml-1m/ml-1m/users.dat"));

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}*/

	}

}
