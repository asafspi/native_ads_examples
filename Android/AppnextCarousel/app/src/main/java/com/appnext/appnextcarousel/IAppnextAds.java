package com.appnext.appnextcarousel;

import com.appnext.appnextsdk.API.AppnextAd;

public interface IAppnextAds{
	void adImpression(AppnextAd ad);
	void adClicked(AppnextAd ad);
}