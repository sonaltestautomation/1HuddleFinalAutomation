Feature: Change Language Feature

Scenario: Verify that change language button is clicking
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And user wait for loading animation to be disappeared

When User clicks on more Button
And User clicks on Change Language button
Then Change language page is opening

Scenario: Verify that correct languages are showing
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And user wait for loading animation to be disappeared

When User clicks on more Button
And User clicks on Change Language button
Then Correct languages are showing in list

Scenario: Verify that Save is working and user is redirecting to the more screen after saving for web app and landing to the games screen after clicking on Done button
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user wait for loading animation to be disappeared
Then player should be logged In successfully

When User clicks on more Button
And User clicks on Change Language button
And User clicks on Save button
Then More page is opening for webapp
Then Games page is opening for mobile app

Scenario: Verify that More, Edit Profile, Help, Changlanguage, Logout, Games, Leaderboard, Profile, Notifications and More text is correct for Francais(Canada)
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user wait for loading animation to be disappeared
Then player should be logged In successfully

When User clicks on more Button
And User clicks on Change Language button
And User selects Language
|Language Name|
|Français (Canada)|
And User selects Language for mobile app
|Language Name|
|français (Canada)|
And User clicks on Save button
And User clicks on more button for mobile app
Then converted more text is correct on More page
|Expected More Text|
|Plus|
Then converted text is correct
|Expected Edit Profile Text|Check for Mob app or not|
|Modifier le profil|yes|
Then converted text is correct
|Expected Help Text|Check for Mob app or not|
|Aide|yes|
Then converted text is correct
|Expected Change Language Text|Check for Mob app or not|
|Changer la langue|yes|
Then converted text is correct
|Expected Logout Text|check for Mob app or not|
|Déconnexion|yes|
Then converted text is correct
|Expected Games Text|check for mob app or not|
|Jeux|no|
Then converted text is correct
|Expected Leaderboards Text|check for mob app or not|
|Podium|no|
Then converted text is correct for side menu profile
|Expected Profile Text|
|Profil|
Then converted text is correct
|Expected Notifications Text|check for mob app or not|
|Notifications|no|
Then converted more text is correct for side menu item
|Expected more Text|
|Plus|
Then converted sound text is correct
|Expected sound Text|
|Son|
And Clicks on Logout button
Then converted text is correct
|Expected player Text|check for mob app or not|
|Joueur|no|
Then converted text is correct
|Expected manager Text|check for mobile app or not|
|Directur|no|
Then converted text is correct
|Expected Next button Text|check for mobile app or not|
|SUIVANT|no|
Then converted enter player email title is correct
|ExpectedText|
|Entrez votre courriel|



Scenario: Verify that More, Edit Profile, Help, Changlanguage, Logout, Games, Leaderboard, Profile, Notifications and More text is correct for Francais
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user wait for loading animation to be disappeared
Then player should be logged In successfully

When User clicks on more Button
And User clicks on Change Language button
And User selects Language
|Language Name|
|Français|
And User selects Language for mobile app
|Language Name|
|français|
And User clicks on Save button
And User clicks on more button for mobile app
Then converted more text is correct on More page
|Expected More Text|
|Plus|
Then converted text is correct
|Expected Edit Profile Text|Check for Mob app or not|
|Modifier le profil|yes|
Then converted text is correct
|Expected Help Text|Check for Mob app or not|
|Aide|yes|
Then converted text is correct
|Expected Change Language Text|Check for Mob app or not|
|Changer la langue|yes|
Then converted text is correct
|Expected Logout Text|check for Mob app or not|
|Déconnexion|yes|
Then converted text is correct
|Expected Games Text|check for mob app or not|
|Jeux|no|
Then converted text is correct
|Expected Leaderboards Text|check for mob app or not|
|Podium|no|
Then converted text is correct for side menu profile
|Expected Profile Text|
|Profil|
Then converted text is correct
|Expected Notifications Text|check for mob app or not|
|Notifications|no|
Then converted more text is correct for side menu item
|Expected more Text|
|Plus|
Then converted sound text is correct
|Expected sound Text|
|Son|
And Clicks on Logout button
Then converted text is correct
|Expected player Text|check for mob app or not|
|Joueur|no|
Then converted text is correct
|Expected manager Text|check for mobile app or not|
|Directur|no|
Then converted text is correct
|Expected Next button Text|check for mobile app or not|
|SUIVANT|no|
Then converted enter player email title is correct
|ExpectedText|
|Entrez votre courriel|


Scenario: Verify that More, Edit Profile, Help, Changlanguage, Logout, Games, Leaderboard, Profile, Notifications and More text is correct for English
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user wait for loading animation to be disappeared
Then player should be logged In successfully

When User clicks on more Button
And User clicks on Change Language button
And User selects Language
|Language Name|
|English|
And User selects Language for mobile app
|Language Name|
|English|
And User clicks on Save button
And User clicks on more button for mobile app
Then converted text is correct
|Expected More Text|Check for Mob app or not|
|MORE|no|
Then converted text is correct
|Expected Edit Profile Text|Check for Mob app or not|
|EDIT PROFILE|yes|
Then converted text is correct
|Expected Help Text|Check for Mob app or not|
|HELP|yes|
Then converted text is correct
|Expected Change Language Text|Check for Mob app or not|
|CHANGE LANGUAGE|yes|
Then converted text is correct
|Expected Logout Text|Check for Mob app or not|
|LOGOUT|yes|
Then converted text is correct for side menu games
|Expected Games Text|
|Games|
Then converted text is correct
|Expected Leaderboards Text|Check for Mob app or not|
|Leaderboards|no|
Then converted text is correct for side menu profile
|Expected Profile Text|
|Profile|
Then converted text is correct
|Expected Notifications Text|Check for Mob app or not|
|Notifications|no|
Then converted text is correct
|Expected more Text|Check for Mob app or not|
|More|no|
And Clicks on Logout button
Then converted text is correct
|Expected player Text|Check for Mob app or not|
|PLAYER|no|
Then converted text is correct
|Expected manager Text|Check for Mob app or not|
|MANAGER|no|
Then converted text is correct
|Expected Next button Text|Check for Mob app or not|
|NEXT|no|
Then converted enter player email title is correct
|ExpectedText|
|Enter your email|

Scenario: Verify that More, Edit Profile, Help, Changlanguage, Logout, Games, Leaderboard, Profile, Notifications and More text is correct for Arabic
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user wait for loading animation to be disappeared
Then player should be logged In successfully

When User clicks on more Button
And User clicks on Change Language button
And User selects Language
|Language Name|
|عربي|
And User selects Language for mobile app
|Language Name|
|عربي|
And User clicks on Save button
And User clicks on more button for mobile app
Then converted text is correct
|Expected More Text|Check for Mob app or not|
|المزيد|no|
Then converted text is correct
|Expected Edit Profile Text|Check for Mob app or not|
|الملف الشخصي|yes|
Then converted text is correct
|Expected Help Text|Check for Mob app or not|
|مساعدة|yes|
Then converted sound text is correct
|Expected sound Text|
|الصوت|
Then converted text is correct
|Expected Change Language Text|Check for Mob app or not|
|تغيير اللغة|yes|
Then converted text is correct
|Expected Logout Text|Check for Mob app or not|
|تسجيل الخروج|yes|
Then converted text is correct
|Expected Games Text|Check for Mob app or not|
|ألعاب|no|
Then converted text is correct
|Expected LEADERBOARD Text|Check for Mob app or not|
|لائحة المتنافسين|no|
Then converted text is correct
|Expected Profile Text|Check for Mob app or not|
|ملف شخصي|no|
Then converted text is correct
|Expected Notifications Text|Check for Mob app or not|
|إشعارات|no|
Then converted text is correct
|Expected More Text|Check for Mob app or not|
|المزيد|no|
And Clicks on Logout button
Then converted text is correct
|Expected player Text|Check for Mob app or not|
|اللاعب|no|
Then converted text is correct
|Expected manager Text|Check for Mob app or not|
|المسؤول|no|
Then converted text is correct
|Expected NEXT button Text|Check for Mob app or not|
|التالي|no|
Then converted enter player email title is correct
|ExpectedText|
|أدخل معرف البريد الإلكتروني هنا|

Scenario: Verify that Edit Profile, Help, Changlanguage, Logout, Games, Leaderboard, Profile, Notifications and More text is correct for Japanese
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user wait for loading animation to be disappeared
Then player should be logged In successfully

When User clicks on more Button
And User clicks on Change Language button
And User selects Language
|Language Name|
|Japanese|
And User selects Language for mobile app
|Language Name|
|Japanese|
And User clicks on Save button
And User clicks on more button for mobile app
Then converted more text is correct on More page
|Expected More Text|check for mob app or not|
|設定|no|
Then converted text is correct
|Expected Edit Profile Text|check for mob app or not|
|プロフィール編集|yes|
Then converted text is correct
|Expected Help Text|check for mob app or not|
|ヘルプ|yes|
Then converted sound text is correct
|Expected sound Text|
|音|
Then converted text is correct
|Expected Change Language Text|check for mob app or not|
|言語を変更|yes|
Then converted text is correct
|Expected Logout Text|check for mob app or not|
|ログアウト|yes|
Then converted text is correct
|Expected Games Text|check for mob app or not|
|ゲーム|no|
Then converted text is correct
|Expected Leaderboards Text|check for mob app or not|
|リーダーボード|no|
Then converted text is correct for side menu profile
|Expected Profile Text|check for mob app or not|
|プロフィール|no|
Then converted text is correct
|Expected Notifications Text|check for mob app or not|
|通知|no|
Then converted more text is correct for side menu item
|Expected more Text|check for mob app or not|
|もっと|no|
And Clicks on Logout button
Then converted text is correct
|Expected player Text|check for mob app or not|
|プレーヤー|no|
Then converted text is correct
|Expected manager Text|check for mob app or not|
|マネージャー|no|
Then converted text is correct
|Expected Next button Text|check for mob app or not|
|次|no|
Then converted enter player email title is correct
|ExpectedText|
|メールアドレスを入力|

Scenario: Verify that Edit Profile, Help, Changlanguage, Logout, Games, Leaderboard, Profile, Notifications and More text is correct for Korian
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user wait for loading animation to be disappeared
Then player should be logged In successfully

When User clicks on more Button
And User clicks on Change Language button
And User selects Language
|Language Name|
|Korean|
And User selects Language for mobile app
|Language Name|
|Korean|
And User clicks on Save button
And user take action on app update popup on mobile app
|Close popup or not|
|No|
And User clicks on more button for mobile app
Then converted more text is correct on More page
|Expected More Text|
|더 보기|
Then converted text is correct
|Expected Edit Profile Text|Check for Mob app or not|
|프로필 수정|yes|
Then converted sound text is correct
|Expected sound Text|
|소리|
Then converted text is correct
|Expected Help Text|Check for Mob app or not|
|도움말|yes|
Then converted text is correct
|Expected Change Language Text|Check for Mob app or not|
|언어 변경|yes|
Then converted text is correct
|Expected Logout Text|Check for Mob app or not|
|로그 아웃|yes|
Then converted text is correct
|Expected Games Text|Check for Mob app or not|
|게임|no|
Then converted Leaderboard text is correct on sidemenu
|Expected Leaderboards Text|
|랭킹|
Then converted text is correct
|Expected Profile Text|Check for Mob app or not|
|프로필|no|
Then converted text is correct
|Expected Notifications Text|Check for Mob app or not|
|알림|no|
Then converted more text is correct for side menu item
|Expected more Text|
|더보기|
And Clicks on Logout button
Then converted text is correct
|Expected player Text|Check for Mob app or not|
|플레이어|no|
Then converted text is correct
|Expected manager Text|Check for Mob app or not|
|매니저|no|
Then converted text is correct
|Expected Next button Text|Check for Mob app or not|
|다음|no|
Then converted enter player email title is correct
|ExpectedText|
|이메일을 입력|
And Manager closes web app if mobile app is opened


Scenario: Verify that More, Edit Profile, Help, Changlanguage, Logout, Games, Leaderboard, Profile, Notifications and More text is correct for German
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user wait for loading animation to be disappeared
Then player should be logged In successfully

When User clicks on more Button
And User clicks on Change Language button
And User selects Language
|Language Name|
|German|
And User selects Language for mobile app
|Language Name|
|German|
And User clicks on Save button
And user take action on app update popup on mobile app
|Close popup or not|
|No|
And User clicks on more button for mobile app
Then converted more text is correct on More page
|Expected More Text|
|MEHR|
Then converted text is correct
|Expected Edit Profile Text|Check for Mob app or not|
|Profil bearbeiten|yes|
Then converted sound text is correct
|Expected sound Text|
|Klang|
Then converted text is correct
|Expected Help Text|Check for Mob app or not|
|Hilfe|yes|
Then converted text is correct
|Expected Change Language Text|Check for Mob app or not|
|Sprache ändern|yes|
Then converted text is correct
|Expected Logout Text|Check for Mob app or not|
|Ausloggen|yes|
Then converted text is correct
|Expected Games Text|Check for Mob app or not|
|SPIELE|no|
Then converted text is correct
|Expected Leaderboards Text|Check for Mob app or not|
|Rangliste|no|
Then converted text is correct for side menu profile
|Expected Profile Text|Check for Mob app or not|
|Profil|no|
Then converted text is correct
|Expected Notifications Text|Check for Mob app or not|
|Benachrichtigungen|no|
Then converted more text is correct for side menu item
|Expected more Text|
|MEHR|
And Clicks on Logout button
Then converted text is correct
|Expected player Text|Check for Mob app or not|
|SPIELER|no|
Then converted text is correct
|Expected manager Text|Check for Mob app or not|
|MANAGER|no|
Then converted text is correct
|Expected Next button Text|Check for Mob app or not|
|NACHSTER|no|
Then converted enter player email title is correct
|ExpectedText|
|Geben sie ihre E-Mail Adresse ein|

Scenario: Verify that More, Edit Profile, Help, Changlanguage, Logout, Games, Leaderboard, Profile, Notifications and More text is correct for Italian
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user wait for loading animation to be disappeared
Then player should be logged In successfully

When User clicks on more Button
And User clicks on Change Language button
And User selects Language
|Language Name|
|Italian|
And User selects Language for mobile app
|Language Name|
|Italian|
And User clicks on Save button
And user take action on app update popup on mobile app
|Close popup or not|
|No|
And User clicks on more button for mobile app
Then converted more text is correct on More page
|Expected More Text|
|DI PIÙ|
Then converted text is correct
|Expected Edit Profile Text|Check for Mob app or not|
|Modifica Profilo|yes|
Then converted sound text is correct
|Expected sound Text|
|Suono|
Then converted text is correct
|Expected Help Text|Check for Mob app or not|
|Aiuto|yes|
Then converted text is correct
|Expected Change Language Text|Check for Mob app or not|
|Cambia lingua|yes|
Then converted text is correct
|Expected Logout Text|Check for Mob app or not|
|Disconnettersi|yes|
Then converted text is correct
|Expected Games Text|Check for Mob app or not|
|GIOCHI|no|
Then converted text is correct
|Expected Leaderboards Text|Check for Mob app or not|
|Classifiche|no|
Then converted text is correct
|Expected Profile Text|Check for Mob app or not|
|Profilo|no|
Then converted text is correct
|Expected Notifications Text|Check for Mob app or not|
|Notifiche|no|
Then converted more text is correct for side menu item
|Expected more Text|
|DI PIÙ|
And Clicks on Logout button
Then converted text is correct
|Expected player Text|Check for Mob app or not|
|GIOCATORE|no|
Then converted text is correct
|Expected manager Text|Check for Mob app or not|
|MANAGER|no|
Then converted text is correct
|Expected Next button Text|Check for Mob app or not|
|Il prossimo|no|
Then converted enter player email title is correct
|ExpectedText|
|Inserisci la tua email|

Scenario: Verify that Edit Profile, Help, Changlanguage, Logout, Games, Leaderboard, Profile, Notifications and More text is correct for Spanish
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user wait for loading animation to be disappeared
Then player should be logged In successfully

When User clicks on more Button
And User clicks on Change Language button
And User selects Language
|Language Name|
|Spanish|
And User selects Language for mobile app
|Language Name|
|Spanish|
And User clicks on Save button
And user take action on app update popup on mobile app
|Close popup or not|
|No|
And User clicks on more button for mobile app
Then converted text is correct
|Expected More Text|Check for Mob app or not|
|Más|no|
Then converted text is correct
|Expected Edit Profile Text|Check for Mob app or not|
|Editar perfil|yes|
Then converted sound text is correct
|Expected sound Text|
|Cambiar idioma|
Then converted text is correct
|Expected Help Text|Check for Mob app or not|
|Ayuda|yes|
Then converted text is correct
|Expected Change Language Text|Check for Mob app or not|
|Cambiar idioma|yes|
Then converted text is correct
|Expected Logout Text|Check for Mob app or not|
|Cerrar sesión|yes|
Then converted text is correct
|Expected Games Text|Check for Mob app or not|
|Juegos|no|
Then converted text is correct
|Expected Leaderboards Text|Check for Mob app or not|
|Tablas de clasificación|no|
Then converted text is correct
|Expected Profile Text|Check for Mob app or not|
|Perfil|no|
Then converted text is correct
|Expected Notifications Text|Check for Mob app or not|
|Notificaciones|no|
Then converted text is correct
|Expected more Text|Check for Mob app or not|
|Más|no|
And Clicks on Logout button
Then converted text is correct
|Expected player Text|Check for Mob app or not|
|JUGADOR|no|
Then converted text is correct
|Expected manager Text|Check for Mob app or not|
|GERENTE|no|
Then converted text is correct
|Expected Next button Text|Check for Mob app or not|
|Próximo|no|
Then converted enter player email title is correct
|ExpectedText|
|ingrese su correo electrónico|


Scenario: Verify that More, Edit Profile, Help, Changlanguage, Logout, Games, Leaderboard, Profile, Notifications and More text is correct for Chinese traditional
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user wait for loading animation to be disappeared
Then player should be logged In successfully

When User clicks on more Button
And User clicks on Change Language button
And User selects Language
|Language Name|
|中國傳統的|
And User selects Language for mobile app
|Language Name|
|中國傳統的)|
|Chinese (Traditional)|
And User clicks on Save button
And user take action on app update popup on mobile app
|Close popup or not|
|No|
And User clicks on more button for mobile app
Then converted text is correct
|Expected More Text|Check for Mob app or not|
|更多|no|
Then converted text is correct
|Expected Edit Profile Text|Check for Mob app or not|
|編輯個人資料|yes|
Then converted sound text is correct
|Expected sound Text|
|声音|
Then converted text is correct
|Expected Help Text|Check for Mob app or not|
|救命|yes|
Then converted text is correct
|Expected Change Language Text|Check for Mob app or not|
|改變語言|yes|
Then converted text is correct
|Expected Logout Text|Check for Mob app or not|
|登出|yes|
Then converted text is correct
|Expected Games Text|Check for Mob app or not|
|遊戲|no|
Then converted text is correct
|Expected Leaderboards Text|Check for Mob app or not|
|排行榜|no|
Then converted text is correct for side menu profile
|Expected Profile Text|
|個人資料|
Then converted text is correct
|Expected Notifications Text|Check for Mob app or not|
|通知|no|
Then converted text is correct
|Expected more Text|Check for Mob app or not|
|更多|no|
And Clicks on Logout button
Then converted text is correct
|Expected player Text|Check for Mob app or not|
|競賽者|no|
Then converted text is correct
|Expected manager Text|Check for Mob app or not|
|經理|no|
Then converted text is correct
|Expected Next button Text|Check for Mob app or not|
|下一個|no|
Then converted enter player email title is correct
|ExpectedText|
|输入你的电子邮箱|
#
Scenario: Verify that More, Edit Profile, Help, Changlanguage, Logout, Games, Leaderboard, Profile, Notifications and More text is correct for Chinese Simplified
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user wait for loading animation to be disappeared
Then player should be logged In successfully

When User clicks on more Button
And User clicks on Change Language button
And User selects Language
|Language Name|
|简体中文|
And User selects Language for mobile app
|Language Name|
|Chinese (Simplified)|
|简体中文|
And User clicks on Save button
And user take action on app update popup on mobile app
|Close popup or not|
|No|
And User clicks on more button for mobile app
Then converted text is correct
|Expected More Text|Check for Mob app or not|
|更多|no|
Then converted text is correct
|Expected Edit Profile Text|Check for Mob app or not|
|编辑个人资料|yes|
Then converted sound text is correct
|Expected sound Text|
|声音|
Then converted text is correct
|Expected Help Text|Check for Mob app or not|
|支援|yes|
Then converted text is correct
|Expected Change Language Text|Check for Mob app or not|
|改变语言|yes|
Then converted text is correct
|Expected Logout Text|Check for Mob app or not|
|登出|yes|
Then converted text is correct
|Expected Games Text|Check for Mob app or not|
|游戏|no|
Then converted text is correct
|Expected Leaderboards Text|Check for Mob app or not|
|排行榜|no|
Then converted text is correct for side menu profile
|Expected Profile Text|Check for Mob app or not|
|个人资料|no|
Then converted text is correct
|Expected Notifications Text|Check for Mob app or not|
|通知|no|
Then converted text is correct
|Expected more Text|Check for Mob app or not|
|更多|no|
And Clicks on Logout button
Then converted text is correct
|Expected player Text|Check for Mob app or not|
|竞赛者|no|
Then converted text is correct
|Expected manager Text|Check for Mob app or not|
|经理|no|
Then converted text is correct
|Expected Next button Text|Check for Mob app or not|
|继续|no|
Then converted enter player email title is correct
|ExpectedText|
|输入你的电子邮箱|