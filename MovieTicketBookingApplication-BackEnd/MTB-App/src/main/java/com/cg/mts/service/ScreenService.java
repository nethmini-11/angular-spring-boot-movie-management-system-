package com.cg.mts.service;

import java.util.List;

import com.cg.mts.exception.ScreenNotFoundException;
import com.cg.mts.model.Screen;
import com.cg.mts.model.Theatre;


public interface ScreenService {
	public Screen addScreen(Screen screen, Integer theatreId) throws ScreenNotFoundException;
	public List<Screen> viewScreenList() throws ScreenNotFoundException;
	public Screen updateScreen(Screen s, Integer theatreId);
	public Screen viewScreen(int screenId) throws ScreenNotFoundException;
	public Theatre getTheatre(int screenId) throws ScreenNotFoundException;
}
