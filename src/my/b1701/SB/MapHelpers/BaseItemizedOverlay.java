package my.b1701.SB.MapHelpers;

import java.util.List;

import my.b1701.SB.Users.NearbyUser;


import android.graphics.drawable.Drawable;

import com.google.android.maps.ItemizedOverlay;

public abstract class BaseItemizedOverlay extends ItemizedOverlay<BaseOverlayItem>{

	public BaseItemizedOverlay(Drawable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	
	protected abstract BaseOverlayItem createItem(int arg0);

	
	public abstract void addList(List <?> l );	
	
	public abstract void addThisUser();
	

}
