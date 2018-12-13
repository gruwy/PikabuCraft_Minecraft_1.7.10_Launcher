package net.launcher.run;

public class Settings
{
	/** Настройка заголовка лаунчера */
	public static final String  title		     = ""; //Заголовок лаунчера
	public static final String  titleInGame  	     = "Minecraft"; //Заголовок лаунчера после авторизации
	public static final String  baseconf		     = "PikabuCraft"; //Папка с файлом конфигурации
	public static final String  pathconst		     = "PikabuCraft/%SERVERNAME%"; //Конструктор пути к папке с MC
	public static final String  skins                    = "MinecraftSkins/"; //Папка скинов
	public static final String  cloaks                   = "MinecraftCloaks/"; //Папка плащей
	/** Параметры подключения */
	public static final String  http	             = "http://";  //Протокол подключения https:// если есть ssl сертификат
	public static final String  domain	 	     = "pikabucraft.online";//Домен сайта
	public static final String  siteDir		     = "pikabulauncher";//Папка с файлами лаунчера на сайте
	public static final String  RegisterUrl	             = "http://pikabucraft.online/index.php?do=register";//Ссылка на регистрацию, при useRegister = false
	public static final String  updateFile		     = "http://pikabucraft.online/pikabulauncher/launcher/fix";//Ссылка на обновления лаунчера. Не писать на конце ".exe .jar"!
	//public static final String  buyVauncherLink          = "http://pikabucraft.online"; //Ссылка на страницу покупки ваучеров
        public static final String  buyBronzeLink            = "https://vk.com/market-135719853?w=product-135719853_436630%2Fquery";
        public static final String  buySilverLink            = "https://vk.com/market-135719853?w=product-135719853_440495%2Fquery";
        public static final String  buyGoldLink              = "https://vk.com/market-135719853?w=product-135719853_440499%2Fquery";
        public static final String  buyDiamondLink           = "https://vk.com/market-135719853?w=product-135719853_440500%2Fquery";
        public static final String  buyGodLink            = "https://vk.com/market-135719853?w=product-135719853_465276%2Fquery";
        public static final String  buyFlyLink            = "https://vk.com/market-135719853?w=product-135719853_465280%2Fquery";
        public static final String  buyPrefixLink              = "https://vk.com/market-135719853?w=product-135719853_465281%2Fquery";
        public static final String  buyNickColorLink           = "https://vk.com/market-135719853?w=product-135719853_465282%2Fquery";
	public static final String  buyAntiAFKLink           = "https://vk.com/market-135719853?w=product-135719853_457005%2Fquery";
        public static final String  iMusicname               = "";
	public static final int  thread                      = 8; //Количество потоков для загрузки файлов.
	public static final String[] p                       = {"wireshark", "cheat"};  //Список запрещенных процессов.
	
	public static int height                             = 550;      //Высота окна клиента
	public static int width                              = 977;      //Ширина окна клиента
	public static int defaultmemory                      = 2048;      //Выделение памяти при первом запуске.
        
	public static String[] servers =
	{
		"PikabuCraft Hi-Tech, , 25565, 1.7.10",
	};

	/** Настройка панели ссылок **/
	public static final String[] links = 
	{
		//Для отключения добавьте в адрес ссылки #
		"Сайт PikabuCraft   ::http://pikabucraft.online",          
                "Мы в ВКонтакте    ::https://vk.com/ofpikabucraft",
                "Правила проекта   ::https://vk.com/topic-135719853_35205773",
		//"::#",
	};

	/** Настройки структуры лаунчера */
	public static boolean useAutoenter	             =  false;  //Использовать функцию автозахода на выбранный сервер
	public static boolean useRegister		     =  false;  //Использовать Регистрацию в лаунчере
	public static boolean useStandartWB		     =  true;   //Использовать стандартный браузер для открытия ссылок
	public static boolean usePersonal		     =  true;   //Использовать Личный кабинет
	public static boolean customframe 		     =  true;   //Использовать кастомный фрейм
	public static boolean useConsoleHider		     =  false;  //Использовать скрытие консоли клиента
	public static boolean useModCheckerTimer	     =  true;   //Перепроверка jar через 30 секунд
	public static int     useModCheckerint               =  2;      //Количество раз перепроверки jar во время игры
	public static boolean assetsfolder                   =  false;  //Скачивать assets из папки, или из архива (true=из папки false=из архива) в connect.php должно быть так же.

	public static final String protectionKey	 = "1234567890"; //Ключ сессии.
	public static final String key1              = "1234567891234567"; //16 Character Key Ключ пост запросов
	public static final String key2              = "1234567891234567"; //16 Character Key Ключ пост запросов
	
	public static boolean debug		 	         =  true; //Отображать все действия лаунчера (отладка)(true/false)
        public static boolean drawTracers		     =  false; //Отрисовывать границы элементов лаунчера
	public static final String masterVersion     = "1.5"; //Версия лаунчера

	public static boolean release 		         =  false;  /**Ставим true после окончания настройки! 
														    Необходимо для автообновления лаунчера 
														    после смены ключей key1 key2.*/
	public static void onStart() {}
	public static void onStartMinecraft() {}
	
}