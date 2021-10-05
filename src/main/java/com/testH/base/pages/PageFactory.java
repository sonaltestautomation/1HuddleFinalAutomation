package com.testH.base.pages;

import com.testH.app.generic.Pojo;
import com.testH.base.desktopView.EditPlayerDetailsPageDesktopView;
import com.testH.base.desktopView.EndGamePageDesktopView;
import com.testH.base.desktopView.GamePausePageDesktopView;
import com.testH.base.desktopView.GamePreviewPageDesktopView;
import com.testH.base.desktopView.HelpPageDesktopView;
import com.testH.base.desktopView.HomePageDesktopView;
import com.testH.base.desktopView.LeaderboardPageDesktopView;
import com.testH.base.desktopView.MorePageDesktopView;
import com.testH.base.desktopView.NotificationsPageDesktopView;
import com.testH.base.desktopView.PlayerProfilePageDesktopView;
import com.testH.base.desktopView.QuestionCategoryPageDesktopView;
import com.testH.base.desktopView.RateQuestionPageDesktopView;
import com.testH.base.desktopView.SelectAnswerPageDesktopView;
import com.testH.base.desktopView.SelectGamePageDesktopView;
import com.testH.base.desktopView.VipCodeDesktopView;
import com.testH.base.pages.androidApp.EditPlayerDetailsPageAndroidApp;
import com.testH.base.pages.androidApp.EndGamePageAndroidApp;
import com.testH.base.pages.androidApp.GamePausePageAndroidApp;
import com.testH.base.pages.androidApp.GamePreviewPageAndroidApp;
import com.testH.base.pages.androidApp.HelpPageAndroidApp;
import com.testH.base.pages.androidApp.HomePageAndroidApp;
import com.testH.base.pages.androidApp.LeaderboardPageAndroidApp;
import com.testH.base.pages.androidApp.MorePageAndroidApp;
import com.testH.base.pages.androidApp.NotificationsPageAndroidApp;
import com.testH.base.pages.androidApp.PlayerProfilePageAndroidApp;
import com.testH.base.pages.androidApp.QuestionCategoryPageAndroidApp;
import com.testH.base.pages.androidApp.RateQuestionPageAndroidApp;
import com.testH.base.pages.androidApp.SelectAnswerPageAndroidApp;
import com.testH.base.pages.androidApp.SelectGamePageAndroidApp;
import com.testH.base.pages.androidApp.VipCodeAndroidApp;
import com.testH.base.pages.client.EditPlayerDetailsPage;
import com.testH.base.pages.client.EndGamePage;
import com.testH.base.pages.client.GamePausePage;
import com.testH.base.pages.client.GamePreviewPage;
import com.testH.base.pages.client.HelpPage;
import com.testH.base.pages.client.HomePage;
import com.testH.base.pages.client.LeaderboardPage;
import com.testH.base.pages.client.MorePage;
import com.testH.base.pages.client.NotificationsPage;
import com.testH.base.pages.client.PlayerProfilePage;
import com.testH.base.pages.client.QuestionCategoryPage;
import com.testH.base.pages.client.RateQuestionPage;
import com.testH.base.pages.client.SelectAnswerPage;
import com.testH.base.pages.client.SelectGamePage;
import com.testH.base.pages.client.VipCode;
import com.testH.base.pages.iOSApp.EditPlayerDetailsPageiOSApp;
import com.testH.base.pages.iOSApp.EndGamePageiOSApp;
import com.testH.base.pages.iOSApp.GamePausePageiOSApp;
import com.testH.base.pages.iOSApp.GamePreviewPageiOSApp;
import com.testH.base.pages.iOSApp.HelpPageiOSApp;
import com.testH.base.pages.iOSApp.HomePageiOSApp;
import com.testH.base.pages.iOSApp.LeaderboardPageiOSApp;
import com.testH.base.pages.iOSApp.MorePageiOSApp;
import com.testH.base.pages.iOSApp.NotificationsPageiOSApp;
import com.testH.base.pages.iOSApp.PlayerProfilePageiOSApp;
import com.testH.base.pages.iOSApp.QuestionCategoryPageiOSApp;
import com.testH.base.pages.iOSApp.RateQuestionPageiOSApp;
import com.testH.base.pages.iOSApp.SelectAnswerPageiOSApp;
import com.testH.base.pages.iOSApp.SelectGamePageiOSApp;
import com.testH.base.pages.iOSApp.VipCodeiOSApp;
import com.testH.base.pages.tabletView.EditPlayerDetailsPageTabletView;
import com.testH.base.pages.tabletView.EndGamePageTabletView;
import com.testH.base.pages.tabletView.GamePausePageTabletView;
import com.testH.base.pages.tabletView.GamePreviewPageTabletView;
import com.testH.base.pages.tabletView.HelpPageTabletView;
import com.testH.base.pages.tabletView.HomePageTabletView;
import com.testH.base.pages.tabletView.LeaderboardPageTabletView;
import com.testH.base.pages.tabletView.MorePageTabletView;
import com.testH.base.pages.tabletView.NotificationsPageTabletView;
import com.testH.base.pages.tabletView.PlayerProfilePageTabletView;
import com.testH.base.pages.tabletView.QuestionCategoryPageTabletView;
import com.testH.base.pages.tabletView.RateQuestionPageTabletView;
import com.testH.base.pages.tabletView.SelectAnswerPageTabletView;
import com.testH.base.pages.tabletView.SelectGamePageTabletView;
import com.testH.base.pages.tabletView.VipCodeTabletView;


public class PageFactory {
	
	private String targetDevice = Pojo.getObjConfig().getProperty("Target.Device").toLowerCase().trim();
	private String desktopView = "desktopview";
	private String mobileView = "mobileview";
	private String androidApp = "androidapp";
	private String iOsApp = "iosapp";
	
	
	// Reference object of Pages
		private HomePage objHomePage;
		private SelectGamePage objSelectGamePage;
		private SelectAnswerPage objSelectAnswerPage;
		private RateQuestionPage objRateQuestionPage;
		private EditPlayerDetailsPage objEditPlayerDetailsPage;
		private EndGamePage objEndGamePage;
		private GamePreviewPage objGamePreviewPage;
		private HelpPage objHelpPage;
		private LeaderboardPage objLeaderboardPage;
		private MorePage objMorePage;
		private NotificationsPage objNotificationsPage;
		private PlayerProfilePage objPlayerProfilePage;
		private QuestionCategoryPage objQuestionCategoryPage;
		private GamePausePage objGamePausePage;
		private VipCode objVipCode;
		
		
		public HomePage getObjHomePage() {

			if (targetDevice.equals(desktopView))
				objHomePage = new HomePageDesktopView();
			if (targetDevice.equals(mobileView))
				objHomePage = new HomePageTabletView();
			if (targetDevice.equals(androidApp))
				objHomePage = new HomePageAndroidApp();
			if (targetDevice.equals(iOsApp))
				objHomePage = new HomePageiOSApp();

			return objHomePage;
		}
		
		public SelectGamePage getSelectGamePage() {

			if (targetDevice.equals(desktopView))
				objSelectGamePage = new SelectGamePageDesktopView();
			if (targetDevice.equals(mobileView))
				objSelectGamePage = new SelectGamePageTabletView();
			if (targetDevice.equals(androidApp))
				objSelectGamePage = new SelectGamePageAndroidApp();
			if (targetDevice.equals(iOsApp))
				objSelectGamePage = new SelectGamePageiOSApp();

			return objSelectGamePage;
		}
		
		public SelectAnswerPage getSelectAnswerPage() {

			if (targetDevice.equals(desktopView))
				objSelectAnswerPage = new SelectAnswerPageDesktopView();
			if (targetDevice.equals(mobileView))
				objSelectAnswerPage = new SelectAnswerPageTabletView();
			if (targetDevice.equals(androidApp))
				objSelectAnswerPage = new SelectAnswerPageAndroidApp();
			if (targetDevice.equals(iOsApp))
				objSelectAnswerPage = new SelectAnswerPageiOSApp();

			return objSelectAnswerPage;
		}
		
		public RateQuestionPage getRateQuestionPage() {

			if (targetDevice.equals(desktopView))
				objRateQuestionPage = new RateQuestionPageDesktopView();
			if (targetDevice.equals(mobileView))
				objRateQuestionPage = new RateQuestionPageTabletView();
			if (targetDevice.equals(androidApp))
				objRateQuestionPage = new RateQuestionPageAndroidApp();
			if (targetDevice.equals(iOsApp))
				objRateQuestionPage = new RateQuestionPageiOSApp();

			return objRateQuestionPage;
		}
		
		
		
		public EditPlayerDetailsPage getEditPlayerDetailsPage() {

			if (targetDevice.equals(desktopView))
				objEditPlayerDetailsPage = new EditPlayerDetailsPageDesktopView();
			if (targetDevice.equals(mobileView))
				objEditPlayerDetailsPage = new EditPlayerDetailsPageTabletView();
			if (targetDevice.equals(androidApp))
				objEditPlayerDetailsPage = new EditPlayerDetailsPageAndroidApp();
			if (targetDevice.equals(iOsApp))
				objEditPlayerDetailsPage = new EditPlayerDetailsPageiOSApp();

			return objEditPlayerDetailsPage;
		}
		
		public EndGamePage getEndGamePage() {

			if (targetDevice.equals(desktopView))
				objEndGamePage = new EndGamePageDesktopView();
			if (targetDevice.equals(mobileView))
				objEndGamePage = new  EndGamePageTabletView();
			if (targetDevice.equals(androidApp))
				objEndGamePage = new EndGamePageAndroidApp();
			if (targetDevice.equals(iOsApp))
				objEndGamePage = new EndGamePageiOSApp();

			return objEndGamePage;
		}
		
		public GamePreviewPage getGamePreviewPage() {

			if (targetDevice.equals(desktopView))
				objGamePreviewPage = new GamePreviewPageDesktopView();
			if (targetDevice.equals(mobileView))
				objGamePreviewPage = new GamePreviewPageTabletView();
			if (targetDevice.equals(androidApp))
				objGamePreviewPage = new GamePreviewPageAndroidApp();
			if (targetDevice.equals(iOsApp))
				objGamePreviewPage = new GamePreviewPageiOSApp();

			return objGamePreviewPage;
		}
		
		public HelpPage getHelpPage() {

			if (targetDevice.equals(desktopView))
				objHelpPage = new HelpPageDesktopView();
			if (targetDevice.equals(mobileView))
				objHelpPage = new HelpPageTabletView();
			if (targetDevice.equals(androidApp))
				objHelpPage = new HelpPageAndroidApp();
			if (targetDevice.equals(iOsApp))
				objHelpPage = new HelpPageiOSApp();

			return objHelpPage;
		}
		
		public LeaderboardPage getLeaderboardPage() {

			if (targetDevice.equals(desktopView))
				objLeaderboardPage = new LeaderboardPageDesktopView();
			if (targetDevice.equals(mobileView))
				objLeaderboardPage = new LeaderboardPageTabletView();
			if (targetDevice.equals(androidApp))
				objLeaderboardPage = new LeaderboardPageAndroidApp();
			if (targetDevice.equals(iOsApp))
				objLeaderboardPage = new LeaderboardPageiOSApp();
			System.out.println("ObjLeader "+objLeaderboardPage);
			return objLeaderboardPage;
		}
		
		public MorePage getMorePage() {

			if (targetDevice.equals(desktopView))
				objMorePage = new MorePageDesktopView();
			if (targetDevice.equals(mobileView))
				objMorePage = new MorePageTabletView();
			if (targetDevice.equals(androidApp))
				objMorePage = new MorePageAndroidApp();
			if (targetDevice.equals(iOsApp))
				objMorePage = new MorePageiOSApp();

			return objMorePage;
		}
		
		public NotificationsPage getNotificationsPage() {

			if (targetDevice.equals(desktopView))
				objNotificationsPage = new NotificationsPageDesktopView();
			if (targetDevice.equals(mobileView))
				objNotificationsPage = new NotificationsPageTabletView();
			if (targetDevice.equals(androidApp))
				objNotificationsPage = new NotificationsPageAndroidApp();
			if (targetDevice.equals(iOsApp))
				objNotificationsPage = new NotificationsPageiOSApp();

			return objNotificationsPage;
		}
		
		public PlayerProfilePage getPlayerProfilePage() {

			if (targetDevice.equals(desktopView))
				objPlayerProfilePage = new PlayerProfilePageDesktopView();
			if (targetDevice.equals(mobileView))
				objPlayerProfilePage = new PlayerProfilePageTabletView();
			if (targetDevice.equals(androidApp))
				objPlayerProfilePage = new PlayerProfilePageAndroidApp();
			if (targetDevice.equals(iOsApp))
				objPlayerProfilePage = new PlayerProfilePageiOSApp();

			return objPlayerProfilePage;
		}
		
		public QuestionCategoryPage getQuestionCategoryPage() {

			if (targetDevice.equals(desktopView))
				objQuestionCategoryPage = new QuestionCategoryPageDesktopView();
			if (targetDevice.equals(mobileView))
				objQuestionCategoryPage = new QuestionCategoryPageTabletView();
			if (targetDevice.equals(androidApp))
				objQuestionCategoryPage = new QuestionCategoryPageAndroidApp();
			if (targetDevice.equals(iOsApp))
				objQuestionCategoryPage = new QuestionCategoryPageiOSApp();

			return objQuestionCategoryPage;
		}
		
		public GamePausePage getGamePausePage() {

			if (targetDevice.equals(desktopView))
				objGamePausePage = new GamePausePageDesktopView();
			if (targetDevice.equals(mobileView))
				objGamePausePage = new GamePausePageTabletView();
			if (targetDevice.equals(androidApp))
				objGamePausePage = new GamePausePageAndroidApp();
			if (targetDevice.equals(iOsApp))
				objGamePausePage = new GamePausePageiOSApp();

			return objGamePausePage;
		}
		
		public VipCode getVipCodePage()
		{
			if (targetDevice.equals(desktopView))
				objVipCode = new VipCodeDesktopView();
			if (targetDevice.equals(mobileView))
				objVipCode = new VipCodeTabletView();
			if (targetDevice.equals(androidApp))
				objVipCode = new VipCodeAndroidApp();
			if (targetDevice.equals(iOsApp))
				objVipCode = new VipCodeiOSApp();

			return objVipCode;
		}
		

}
