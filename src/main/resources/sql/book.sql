INSERT INTO `book` (
    `id`, `title`, `author`, `isbn`, `publisher`,
    `publish_date`, `category`, `description`, `cover_url`,
    `total_stock`, `available_stock`, `is_deleted`
) VALUES
-- 【顶级热门】文学经典+现象级作品（1-20）
(1, '三体', '刘慈欣', '9787536692930', '重庆出版社', '2008-01-01', '文学/科幻', '文化大革命如火如荼进行的同时，军方探寻外星文明的绝秘计划“红岸工程”取得了突破性进展。', 'https://img9.doubanio.com/view/subject/s/public/s2768378.jpg', 30, 22, 0),
(2, '活着', '余华', '9787506365437', '作家出版社', '2012-08-01', '文学/小说', '讲述了农村人福贵悲惨的人生遭遇，展现了生命的韧性与重量。', 'https://img9.doubanio.com/view/subject/s/public/s1046539.jpg', 35, 28, 0),
(3, '百年孤独', '加西亚·马尔克斯', '9787544253994', '南海出版公司', '2011-06-01', '文学/小说', '《百年孤独》是魔幻现实主义文学的代表作，讲述布恩迪亚家族七代人的传奇故事。', 'https://img2.doubanio.com/view/subject/s/public/s1053416.jpg', 25, 18, 0),
(4, '白夜行', '东野圭吾', '9787544258609', '南海出版公司', '2013-01-01', '文学/悬疑', '绝望的念想，悲恸的守望，跨越二十年的罪恶与救赎。', 'https://img1.doubanio.com/view/subject/s/public/s2586951.jpg', 32, 19, 0),
(5, '红楼梦', '曹雪芹', '9787020002207', '人民文学出版社', '1996-12-01', '文学/经典', '中国古典小说巅峰之作，描绘贾史王薛四大家族的兴衰。', 'https://img9.doubanio.com/view/subject/s/public/s1778272.jpg', 40, 25, 0),
(6, '解忧杂货店', '东野圭吾', '9787544270878', '南海出版公司', '2014-05-01', '文学/小说', '现代人内心流失的东西，这家杂货店能帮你找回。', 'https://img9.doubanio.com/view/subject/s/public/s2707140.jpg', 38, 24, 0),
(7, '三体II：黑暗森林', '刘慈欣', '9787536692947', '重庆出版社', '2008-05-01', '文学/科幻', '庞大的三体舰队直扑太阳系，人类面对前所未有的危局。', 'https://img9.doubanio.com/view/subject/s/public/s3077181.jpg', 28, 20, 0),
(8, '三体III：死神永生', '刘慈欣', '9787536699981', '重庆出版社', '2010-11-01', '文学/科幻', '与三体文明的战争，让人类首次看到宇宙的黑暗森林法则。', 'https://img9.doubanio.com/view/subject/s/public/s3366854.jpg', 26, 18, 0),
(9, '追风筝的人', '卡勒德·胡赛尼', '9787208061644', '上海人民出版社', '2006-05-01', '文学/小说', '为你，千千万万遍——关于救赎与成长的经典故事。', 'https://img2.doubanio.com/view/subject/s/public/s1027949.jpg', 35, 22, 0),
(10, '平凡的世界', '路遥', '9787530219218', '北京十月文艺出版社', '2019-06-01', '文学/小说', '展示普通人在大时代历史进程中走过的艰难曲折道路。', 'https://img9.doubanio.com/view/subject/s/public/s2982527.jpg', 42, 15, 0),
(11, '小王子', '安托万·德·圣-埃克苏佩里', '9787544294201', '南海出版公司', '2019-06-01', '文学/童话', '用诗意的语言讲述成长与真爱的本质。', 'https://img9.doubanio.com/view/subject/s/public/s3356277.jpg', 45, 30, 0),
(12, '西游记', '吴承恩', '9787020008735', '人民文学出版社', '1980-05-01', '文学/经典', '神魔小说代表作，师徒四人西天取经的传奇。', 'https://img9.doubanio.com/view/subject/s/public/s1792683.jpg', 38, 20, 0),
(13, '围城', '钱钟书', '9787020024759', '人民文学出版社', '1991-02-01', '文学/小说', '城外的人想冲进去，城里的人想逃出来，道尽人生百态。', 'https://img9.doubanio.com/view/subject/s/public/s1047097.jpg', 28, 14, 0),
(14, '嫌疑人X的献身', '东野圭吾', '9787544281907', '南海出版公司', '2017-01-01', '文学/悬疑', '极致的诡计，纯粹的爱情，东野圭吾巅峰之作。', 'https://img9.doubanio.com/view/subject/s/public/s2809780.jpg', 30, 15, 0),
(15, '恶意', '东野圭吾', '9787544281345', '南海出版公司', '2016-01-01', '文学/悬疑', '探讨人性深处无法言说的恶意，反转震撼。', 'https://img9.doubanio.com/view/subject/s/public/s2919087.jpg', 26, 12, 0),
(16, '骆驼祥子', '老舍', '9787020002214', '人民文学出版社', '1999-05-01', '文学/经典', '旧北京人力车夫的悲惨命运，折射时代的悲哀。', 'https://img9.doubanio.com/view/subject/s/public/s1792697.jpg', 32, 18, 0),
(17, '茶馆', '老舍', '9787020072606', '人民文学出版社', '2008-01-01', '文学/戏剧', '通过茶馆的兴衰，折射半个世纪的社会变迁。', 'https://img9.doubanio.com/view/subject/s/public/s2384117.jpg', 25, 12, 0),
(18, '城南旧事', '林海音', '9787020090002', '人民文学出版社', '2012-01-01', '文学/小说', '以童年视角，讲述老北京的温暖与离别。', 'https://img9.doubanio.com/view/subject/s/public/s1046589.jpg', 30, 20, 0),
(19, '活着本来单纯', '丰子恺', '9787535490560', '长江文艺出版社', '2016-03-01', '文学/散文', '丰子恺散文精选，于平淡中见真味。', 'https://img9.doubanio.com/view/subject/s/public/s2838756.jpg', 28, 20, 0),
(20, '白夜行（精装版）', '东野圭吾', '9787544298983', '南海出版公司', '2021-01-01', '文学/悬疑', '白夜行精装典藏版，新增珍贵后记。', 'https://img9.doubanio.com/view/subject/s/public/s4072151.jpg', 22, 10, 0),

-- 【超热门】计算机经典（21-50）
(21, '算法导论', 'Thomas H. Cormen', '9787111407010', '机械工业出版社', '2013-01-01', '计算机/算法', '算法领域的标准教材，覆盖所有核心算法思想。', 'https://img9.doubanio.com/view/subject/s/public/s2768996.jpg', 25, 18, 0),
(22, 'Python编程：从入门到实践', 'Eric Matthes', '9787115428028', '人民邮电出版社', '2016-07-01', '计算机/编程', 'Python入门经典，实战+理论双结合。', 'https://img9.doubanio.com/view/subject/s/public/s2876676.jpg', 40, 28, 0),
(23, 'Java编程思想', 'Bruce Eckel', '9787111213826', '机械工业出版社', '2007-06-01', '计算机/编程', 'Java经典入门，深入理解面向对象思想。', 'https://img9.doubanio.com/view/subject/s/public/s1049938.jpg', 32, 20, 0),
(24, 'JavaScript高级程序设计', 'Matt Frisbie', '9787115545381', '人民邮电出版社', '2020-09-01', '计算机/编程', 'JavaScript开发者不可或缺的权威参考书。', 'https://img9.doubanio.com/view/subject/s/public/s3497129.jpg', 28, 15, 0),
(25, '深入浅出Vue.js', '刘博文', '9787115509066', '人民邮电出版社', '2019-03-01', '计算机/编程', '从Vue.js源码入手，解决核心使用问题。', 'https://img9.doubanio.com/view/subject/s/public/s3290486.jpg', 22, 18, 0),
(26, '设计模式：可复用面向对象软件的基础', 'Erich Gamma', '9787111075752', '机械工业出版社', '2000-09-01', '计算机/软件工程', '23个经典设计模式，面向对象设计的圣经。', 'https://img9.doubanio.com/view/subject/s/public/s1029906.jpg', 20, 12, 0),
(27, '代码大全', 'Steve McConnell', '9787121155914', '电子工业出版社', '2011-12-01', '计算机/软件工程', '软件开发的百科全书，覆盖编码全流程。', 'https://img9.doubanio.com/view/subject/s/public/s1046669.jpg', 25, 18, 0),
(28, '人月神话', 'Frederick P. Brooks Jr.', '9787302152686', '清华大学出版社', '2007-09-01', '计算机/软件工程', '软件工程领域的经典，揭示项目管理的本质。', 'https://img9.doubanio.com/view/subject/s/public/s1046670.jpg', 20, 12, 0),
(29, '深度学习', 'Ian Goodfellow', '9787115461476', '人民邮电出版社', '2017-08-01', '计算机/AI', 'AI领域的深蓝宝书，全面讲解深度学习核心。', 'https://img9.doubanio.com/view/subject/s/public/s2917794.jpg', 18, 10, 0),
(30, '计算机网络：自顶向下方法', 'James F. Kurose', '9787111599715', '机械工业出版社', '2018-06-01', '计算机/网络', '最流行的计算机网络教材，自顶向下讲解网络架构。', 'https://img9.doubanio.com/view/subject/s/public/s3363459.jpg', 30, 22, 0),
(31, '剑指Offer', '何海涛', '9787121310928', '电子工业出版社', '2017-05-01', '计算机/面试', '程序员面试宝典，覆盖大厂高频面试题。', 'https://img9.doubanio.com/view/subject/s/public/s3184470.jpg', 35, 25, 0),
(32, '高性能MySQL', 'Baron Schwartz', '9787115473517', '人民邮电出版社', '2017-08-01', '计算机/数据库', 'MySQL性能优化权威指南，一线实践总结。', 'https://img9.doubanio.com/view/subject/s/public/s2876691.jpg', 20, 12, 0),
(33, 'Redis设计与实现', '黄健宏', '9787115370592', '人民邮电出版社', '2014-10-01', '计算机/数据库', '深入理解Redis内部机制，从源码到实战。', 'https://img9.doubanio.com/view/subject/s/public/s2769001.jpg', 18, 10, 0),
(34, '流畅的Python', 'Luciano Ramalho', '9787115454157', '人民邮电出版社', '2017-05-01', '计算机/编程', 'Python进阶必读，掌握Pythonic编程风格。', 'https://img9.doubanio.com/view/subject/s/public/s2876684.jpg', 22, 15, 0),
(35, '重构', 'Martin Fowler', '9787115508649', '人民邮电出版社', '2019-04-01', '计算机/软件工程', '改善既有代码设计的经典，重构核心方法论。', 'https://img9.doubanio.com/view/subject/s/public/s3290490.jpg', 18, 12, 0),
(36, 'Clean Code', 'Robert C. Martin', '9787115216878', '人民邮电出版社', '2010-01-01', '计算机/编程', '代码整洁之道，写出可维护的高质量代码。', 'https://img9.doubanio.com/view/subject/s/public/s1046671.jpg', 20, 15, 0),
(37, '深入理解计算机系统', 'Randal E. Bryant', '9787111544939', '机械工业出版社', '2016-07-01', '计算机/系统', '从程序员视角理解计算机系统底层原理。', 'https://img9.doubanio.com/view/subject/s/public/s2876694.jpg', 25, 18, 0),
(38, '数据库系统概念', 'Abraham Silberschatz', '9787111578133', '机械工业出版社', '2019-02-01', '计算机/数据库', '数据库领域经典教材，覆盖核心概念与实现。', 'https://img9.doubanio.com/view/subject/s/public/s3363460.jpg', 22, 15, 0),
(39, '编译原理', 'Alfred V. Aho', '9787111544938', '机械工业出版社', '2018-01-01', '计算机/编程', '龙书，编译原理领域的权威著作。', 'https://img9.doubanio.com/view/subject/s/public/s2876692.jpg', 18, 10, 0),
(40, '操作系统概念', 'Abraham Silberschatz', '9787111644865', '机械工业出版社', '2020-07-01', '计算机/系统', '操作系统经典教材，覆盖进程、内存、文件等核心。', 'https://img9.doubanio.com/view/subject/s/public/s3997138.jpg', 25, 18, 0),
(41, '黑客与画家', 'Paul Graham', '9787115249494', '人民邮电出版社', '2011-04-01', '计算机/随笔', '硅谷创业教父的文集，洞察编程与创业本质。', 'https://img9.doubanio.com/view/subject/s/public/s1046672.jpg', 20, 18, 0),
(42, 'C++ Primer', 'Stanley B. Lippman', '9787115224145', '人民邮电出版社', '2013-09-01', '计算机/编程', 'C++入门经典，全面覆盖C++11特性。', 'https://img9.doubanio.com/view/subject/s/public/s2769002.jpg', 28, 20, 0),
(43, 'Effective Java', 'Joshua Bloch', '9787111547584', '机械工业出版社', '2018-12-01', '计算机/编程', 'Java进阶必读，编写高效、健壮的Java代码。', 'https://img9.doubanio.com/view/subject/s/public/s3363461.jpg', 22, 15, 0),
(44, 'Go程序设计语言', 'Alan A. A. Donovan', '9787115442147', '人民邮电出版社', '2017-06-01', '计算机/编程', 'Go语言官方经典教材，掌握Go核心特性。', 'https://img9.doubanio.com/view/subject/s/public/s2876686.jpg', 25, 18, 0),
(45, 'Node.js实战', 'Ryan Dahl', '9787115471703', '人民邮电出版社', '2018-01-01', '计算机/编程', 'Node.js创始人亲授，实战讲解异步编程。', 'https://img9.doubanio.com/view/subject/s/public/s3077190.jpg', 20, 12, 0),
(46, 'React学习手册', 'Alex Banks', '9787115599980', '人民邮电出版社', '2022-01-01', '计算机/编程', 'React核心原理与实战，覆盖Hooks新特性。', 'https://img9.doubanio.com/view/subject/s/public/s4072160.jpg', 22, 15, 0),
(47, 'Spring实战', 'Craig Walls', '9787115536860', '人民邮电出版社', '2021-01-01', '计算机/框架', 'Spring框架经典教程，覆盖Spring Boot 2.x。', 'https://img9.doubanio.com/view/subject/s/public/s4072161.jpg', 28, 20, 0),
(48, 'MyBatis从入门到精通', '刘增辉', '9787115441187', '人民邮电出版社', '2016-10-01', '计算机/框架', 'MyBatis实战指南，从基础到高级应用。', 'https://img9.doubanio.com/view/subject/s/public/s2876690.jpg', 20, 12, 0),
(49, '微服务架构设计模式', 'Chris Richardson', '9787115545114', '人民邮电出版社', '2020-07-01', '计算机/架构', '微服务设计权威指南，覆盖架构设计与落地。', 'https://img9.doubanio.com/view/subject/s/public/s3497130.jpg', 18, 10, 0),
(50, '架构整洁之道', 'Robert C. Martin', '9787115524292', '人民邮电出版社', '2019-10-01', '计算机/架构', '整洁架构思想，构建高可维护的软件系统。', 'https://img9.doubanio.com/view/subject/s/public/s3997139.jpg', 20, 12, 0),

-- 【热门】经管/心理学（51-80）
(51, '思考快与慢', '丹尼尔·卡尼曼', '9787508633558', '中信出版社', '2012-07-01', '心理学/经济', '讲述大脑的两种思考方式：快思考与慢思考，揭示决策偏差。', 'https://img9.doubanio.com/view/subject/s/public/s1046673.jpg', 35, 25, 0),
(52, '影响力', '罗伯特·西奥迪尼', '9787508680514', '中信出版社', '2018-06-01', '心理学/营销', '揭示顺从他人行为背后的6大心理秘笈。', 'https://img9.doubanio.com/view/subject/s/public/s3497131.jpg', 38, 28, 0),
(53, '原则', '瑞·达利欧', '9787508684068', '中信出版社', '2018-01-01', '经管/个人成长', '桥水创始人的人生经验与工作原则，指导决策与成长。', 'https://img9.doubanio.com/view/subject/s/public/s3077191.jpg', 40, 30, 0),
(54, '穷查理宝典', '彼得·考夫曼', '9787508663895', '中信出版社', '2016-08-01', '经管/智慧', '查理·芒格的智慧箴言录，多元思维模型的精髓。', 'https://img9.doubanio.com/view/subject/s/public/s2769003.jpg', 32, 25, 0),
(55, '人类简史', '尤瓦尔·赫拉利', '9787508647357', '中信出版社', '2014-11-01', '历史/科普', '从认知革命到科学革命，全方位回顾人类发展史。', 'https://img9.doubanio.com/view/subject/s/public/s2876695.jpg', 38, 28, 0),
(56, '明朝那些事儿', '当年明月', '9787505722460', '中国友谊出版公司', '2006-09-01', '历史/通俗', '以通俗幽默的方式讲述明朝三百年历史。', 'https://img9.doubanio.com/view/subject/s/public/s1046674.jpg', 45, 18, 0),
(57, '富爸爸穷爸爸', '罗伯特·清崎', '9787541158502', '四川文艺出版社', '2019-04-01', '经管/理财', '颠覆传统理财观念，建立财富思维。', 'https://img9.doubanio.com/view/subject/s/public/s3997140.jpg', 40, 28, 0),
(58, '穷爸爸富爸爸实践篇', '罗伯特·清崎', '9787541142202', '四川文艺出版社', '2014-01-01', '经管/理财', '将富爸爸理念落地的实战指南。', 'https://img9.doubanio.com/view/subject/s/public/s2769004.jpg', 30, 20, 0),
(59, '小狗钱钱', '博多·舍费尔', '9787540495298', '中信出版社', '2021-01-01', '经管/理财', '儿童财商启蒙经典，成人也能读懂的理财入门。', 'https://img9.doubanio.com/view/subject/s/public/s4072162.jpg', 35, 25, 0),
(60, '财富自由之路', '李笑来', '9787111547959', '机械工业出版社', '2017-08-01', '经管/个人成长', '构建财富思维，实现个人成长与财富积累。', 'https://img9.doubanio.com/view/subject/s/public/s2917795.jpg', 32, 22, 0),
(61, '高效能人士的七个习惯', '史蒂芬·柯维', '9787500471500', '中国青年出版社', '2008-06-01', '经管/个人成长', '全球经典的个人成长指南，培养高效能思维。', 'https://img9.doubanio.com/view/subject/s/public/s1046675.jpg', 40, 28, 0),
(62, '刻意练习', '安德斯·艾利克森', '9787115455072', '机械工业出版社', '2016-11-01', '心理学/成长', '揭示高手的成长法则：刻意练习是关键。', 'https://img9.doubanio.com/view/subject/s/public/s2876696.jpg', 35, 25, 0),
(63, '非暴力沟通', '马歇尔·卢森堡', '9787508098740', '华夏出版社', '2018-01-01', '心理学/沟通', '改善沟通方式，建立和谐的人际关系。', 'https://img9.doubanio.com/view/subject/s/public/s3363462.jpg', 40, 30, 0),
(64, '被讨厌的勇气', '岸见一郎', '9787559604388', '机械工业出版社', '2017-03-01', '心理学/成长', '基于阿德勒心理学，获得幸福的勇气。', 'https://img9.doubanio.com/view/subject/s/public/s3077192.jpg', 38, 28, 0),
(65, '蛤蟆先生去看心理医生', '罗伯特·戴博德', '9787559638206', '天津人民出版社', '2020-08-01', '心理学/通俗', '以童话形式讲述心理咨询的过程，治愈内心。', 'https://img9.doubanio.com/view/subject/s/public/s4072163.jpg', 45, 35, 0),
(66, '认知觉醒', '周岭', '9787115536877', '人民邮电出版社', '2020-09-01', '心理学/成长', '开启自我改变的原动力，提升认知能力。', 'https://img9.doubanio.com/view/subject/s/public/s4072164.jpg', 35, 25, 0),
(67, '心流', '米哈里·契克森米哈赖', '9787508694052', '中信出版社', '2019-07-01', '心理学/幸福', '揭示最优体验的心理学，获得内心的平静。', 'https://img9.doubanio.com/view/subject/s/public/s3997141.jpg', 30, 20, 0),
(68, '少有人走的路', 'M·斯科特·派克', '9787515508272', '中华工商联合出版社', '2017-06-01', '心理学/成长', '直面人生的苦难，实现心智的成熟。', 'https://img9.doubanio.com/view/subject/s/public/s2769005.jpg', 32, 22, 0),
(69, '乌合之众', '古斯塔夫·勒庞', '9787510801735', '九州出版社', '2010-08-01', '心理学/社会', '揭示群体心理的特征，理解大众行为。', 'https://img9.doubanio.com/view/subject/s/public/s1046676.jpg', 35, 25, 0),
(70, '怪诞行为学', '丹·艾瑞里', '9787508680963', '中信出版社', '2017-11-01', '心理学/经济', '揭示非理性行为背后的心理规律。', 'https://img9.doubanio.com/view/subject/s/public/s3497132.jpg', 30, 20, 0),
(71, '流量池', '杨飞', '9787508688355', '中信出版社', '2018-01-01', '经管/营销', '移动互联网时代的流量获取与运营指南。', 'https://img9.doubanio.com/view/subject/s/public/s3077193.jpg', 25, 15, 0),
(72, '定位', '艾·里斯', '9787508096334', '机械工业出版社', '2019-01-01', '经管/营销', '营销定位理论的经典，打造品牌心智。', 'https://img9.doubanio.com/view/subject/s/public/s2876697.jpg', 28, 20, 0),
(73, '爆款文案', '关健明', '9787115486452', '人民邮电出版社', '2019-01-01', '经管/营销', '写出高转化文案的实战技巧。', 'https://img9.doubanio.com/view/subject/s/public/s3997142.jpg', 25, 18, 0),
(74, '精益创业', '埃里克·莱斯', '9787508640788', '中信出版社', '2012-08-01', '经管/创业', '互联网时代的创业方法论，快速试错迭代。', 'https://img9.doubanio.com/view/subject/s/public/s1046677.jpg', 28, 20, 0),
(75, '从零到一', '彼得·蒂尔', '9787508649719', '中信出版社', '2015-01-01', '经管/创业', '硅谷创投教父的创业哲学，打造垄断性企业。', 'https://img9.doubanio.com/view/subject/s/public/s2769006.jpg', 30, 22, 0),
(76, '商业模式新生代', '亚历山大·奥斯特瓦德', '9787111644481', '机械工业出版社', '2021-01-01', '经管/创业', '可视化商业模式设计，创新商业思维。', 'https://img9.doubanio.com/view/subject/s/public/s4072165.jpg', 25, 15, 0),
(77, '卓有成效的管理者', '彼得·德鲁克', '9787111544993', '机械工业出版社', '2019-06-01', '经管/管理', '德鲁克经典，如何成为卓有成效的管理者。', 'https://img9.doubanio.com/view/subject/s/public/s3363463.jpg', 28, 20, 0),
(78, '管理的实践', '彼得·德鲁克', '9787111603079', '机械工业出版社', '2019-07-01', '经管/管理', '管理学的经典，奠定现代管理理论。', 'https://img9.doubanio.com/view/subject/s/public/s3997143.jpg', 25, 18, 0),
(79, '巴菲特致股东的信', '劳伦斯·坎宁安', '9787111641478', '机械工业出版社', '2020-07-01', '经管/投资', '整理巴菲特历年股东信，揭秘投资哲学。', 'https://img9.doubanio.com/view/subject/s/public/s4072166.jpg', 28, 20, 0),
(80, '指数基金定投', '银行螺丝钉', '9787115516883', '人民邮电出版社', '2019-12-01', '经管/理财', '普通人的低风险理财指南，指数基金定投实操。', 'https://img9.doubanio.com/view/subject/s/public/s4072167.jpg', 30, 22, 0),

-- 【热门】历史/科普（81-110）
(81, '中国通史', '吕思勉', '9787508095136', '华夏出版社', '2016-01-01', '历史/通史', '简明扼要的中国通史，覆盖从远古到近代的历史。', 'https://img9.doubanio.com/view/subject/s/public/s3363464.jpg', 30, 20, 0),
(82, '全球通史', '斯塔夫里阿诺斯', '9787500470578', '北京大学出版社', '2006-01-01', '历史/通史', '全景式展现人类文明发展史，全球视角看历史。', 'https://img9.doubanio.com/view/subject/s/public/s1046678.jpg', 28, 20, 0),
(83, '史记', '司马迁', '9787020135284', '人民文学出版社', '2018-08-01', '历史/经典', '中国第一部纪传体通史，史家之绝唱。', 'https://img9.doubanio.com/view/subject/s/public/s3997144.jpg', 32, 22, 0),
(84, '资治通鉴', '司马光', '9787101135325', '中华书局', '2019-01-01', '历史/经典', '编年体通史，帝王的治国参考书。', 'https://img9.doubanio.com/view/subject/s/public/s4072168.jpg', 28, 18, 0),
(85, '万历十五年', '黄仁宇', '9787108006386', '生活·读书·新知三联书店', '2015-09-01', '历史/明清', '以小见大，讲述明朝衰落的关键节点。', 'https://img9.doubanio.com/view/subject/s/public/s1046679.jpg', 30, 22, 0),
(86, '大秦帝国', '孙皓晖', '9787506390680', '作家出版社', '2019-01-01', '历史/小说', '全景式展现大秦帝国的崛起与衰落。', 'https://img9.doubanio.com/view/subject/s/public/s2769007.jpg', 35, 25, 0),
(87, '二千年间', '胡绳', '9787108064601', '生活·读书·新知三联书店', '2019-07-01', '历史/通俗', '简明讲述中国两千年的历史变迁。', 'https://img9.doubanio.com/view/subject/s/public/s4072169.jpg', 25, 18, 0),
(88, '三国史话', '吕思勉', '9787101138135', '中华书局', '2019-08-01', '历史/三国', '还原真实的三国历史，打破演义误区。', 'https://img9.doubanio.com/view/subject/s/public/s4072170.jpg', 28, 20, 0),
(89, '耶路撒冷三千年', '西蒙·蒙蒂菲奥里', '9787508649269', '中信出版社', '2015-01-01', '历史/宗教', '讲述耶路撒冷的前世今生，宗教与历史的交织。', 'https://img9.doubanio.com/view/subject/s/public/s2876698.jpg', 25, 18, 0),
(90, '枪炮、病菌与钢铁', '贾雷德·戴蒙德', '9787508682586', '中信出版社', '2017-07-01', '历史/科普', '探讨人类社会发展的地理决定论。', 'https://img9.doubanio.com/view/subject/s/public/s3497133.jpg', 30, 22, 0),
(91, '时间简史', '史蒂芬·霍金', '9787535794567', '湖南科学技术出版社', '2018-11-01', '科普/物理', '普及相对论与量子力学，探索宇宙的起源。', 'https://img9.doubanio.com/view/subject/s/public/s1046680.jpg', 35, 25, 0),
(92, '果壳中的宇宙', '史蒂芬·霍金', '9787535733697', '湖南科学技术出版社', '2002-02-01', '科普/物理', '延续《时间简史》，探索宇宙的未来。', 'https://img9.doubanio.com/view/subject/s/public/s1046681.jpg', 28, 20, 0),
(93, '万物简史', '比尔·布莱森', '9787535745158', '湖南科学技术出版社', '2005-02-01', '科普/综合', '从宇宙大爆炸到人类文明，讲述万物的故事。', 'https://img9.doubanio.com/view/subject/s/public/s1046682.jpg', 32, 25, 0),
(94, '自私的基因', '理查德·道金斯', '9787532790657', '上海译文出版社', '2023-01-01', '科普/生物', '揭示基因的自私本质，理解生命的进化。', 'https://img9.doubanio.com/view/subject/s/public/s4072171.jpg', 30, 22, 0),
(95, '人类群星闪耀时', '茨威格', '9787544760940', '译林出版社', '2017-06-01', '历史/人物', '讲述改变人类历史的14个瞬间。', 'https://img9.doubanio.com/view/subject/s/public/s2769008.jpg', 35, 25, 0),
(96, '从一到无穷大', '乔治·伽莫夫', '9787535795757', '湖南科学技术出版社', '2019-07-01', '科普/数学', '经典科普读物，覆盖数学、物理、生物等领域。', 'https://img9.doubanio.com/view/subject/s/public/s3997145.jpg', 30, 22, 0),
(97, '三体中的物理学', '李淼', '9787535794512', '湖南科学技术出版社', '2018-01-01', '科普/物理', '解读《三体》中的物理知识，科幻与科学的结合。', 'https://img9.doubanio.com/view/subject/s/public/s3077194.jpg', 28, 20, 0),
(98, '昆虫记', '法布尔', '9787508096792', '华夏出版社', '2019-01-01', '科普/生物', '讲述昆虫的生活，充满趣味与科学。', 'https://img9.doubanio.com/view/subject/s/public/s4072172.jpg', 32, 25, 0),
(99, '海底两万里', '儒勒·凡尔纳', '9787501614215', '人民文学出版社', '2018-05-01', '文学/科幻', '经典科幻小说，探索海底世界的奥秘。', 'https://img9.doubanio.com/view/subject/s/public/s1792705.jpg', 30, 22, 0),
(100, '流浪地球', '刘慈欣', '9787536499012', '四川科学技术出版社', '2020-01-01', '文学/科幻', '刘慈欣短篇科幻精选，包含《流浪地球》等经典。', 'https://img9.doubanio.com/view/subject/s/public/s3997146.jpg', 35, 25, 0),
(101, '沙丘', '弗兰克·赫伯特', '9787536499098', '四川科学技术出版社', '2020-07-01', '文学/科幻', '科幻史上的经典，讲述沙漠星球的传奇。', 'https://img9.doubanio.com/view/subject/s/public/s4072173.jpg', 30, 22, 0),
(102, '银河帝国：基地', '艾萨克·阿西莫夫', '9787539983295', '江苏凤凰文艺出版社', '2015-09-01', '文学/科幻', '银河帝国系列开篇，心理史学的经典。', 'https://img9.doubanio.com/view/subject/s/public/s2876699.jpg', 28, 20, 0),
(103, '2001太空漫游', '阿瑟·克拉克', '9787536499159', '四川科学技术出版社', '2021-01-01', '文学/科幻', '科幻经典，探索人类与人工智能的未来。', 'https://img9.doubanio.com/view/subject/s/public/s4072174.jpg', 25, 18, 0),
(104, '阿西莫夫科幻小说集', '艾萨克·阿西莫夫', '9787536498992', '四川科学技术出版社', '2019-12-01', '文学/科幻', '阿西莫夫经典短篇科幻合集。', 'https://img9.doubanio.com/view/subject/s/public/s4072175.jpg', 28, 20, 0),
(105, '解忧杂货店（新版）', '东野圭吾', '9787544298990', '南海出版公司', '2020-09-01', '文学/小说', '新版解忧杂货店，新增序章与作者访谈。', 'https://img9.doubanio.com/view/subject/s/public/s4072176.jpg', 30, 22, 0),
(106, '云边有个小卖部', '张嘉佳', '9787530218750', '北京十月文艺出版社', '2018-07-01', '文学/小说', '温暖治愈的故事，关于亲情与成长。', 'https://img9.doubanio.com/view/subject/s/public/s3799798.jpg', 35, 25, 0),
(107, '人间失格', '太宰治', '9787540488402', '湖南文艺出版社', '2019-01-01', '文学/小说', '太宰治的自传体小说，探讨人性与生存。', 'https://img9.doubanio.com/view/subject/s/public/s3799799.jpg', 30, 20, 0),
(108, '挪威的森林', '村上春树', '9787544291943', '南海出版公司', '2018-09-01', '文学/小说', '村上春树经典，讲述青春与孤独。', 'https://img9.doubanio.com/view/subject/s/public/s3799800.jpg', 32, 22, 0),
(109, '霍乱时期的爱情', '加西亚·马尔克斯', '9787544294256', '南海出版公司', '2019-05-01', '文学/小说', '马尔克斯经典，讲述跨越半个世纪的爱情。', 'https://img9.doubanio.com/view/subject/s/public/s3799801.jpg', 30, 22, 0),
(110, '局外人', '阿尔贝·加缪', '9787544294270', '南海出版公司', '2019-06-01', '文学/小说', '加缪经典，探讨存在主义的核心。', 'https://img9.doubanio.com/view/subject/s/public/s3799802.jpg', 28, 20, 0),

-- 【新增补充】文学/社科（111-140）
(111, '麦田里的守望者', 'J.D.塞林格', '9787544294287', '南海出版公司', '2019-07-01', '文学/小说', '讲述青少年的叛逆与成长，经典青春文学。', 'https://img9.doubanio.com/view/subject/s/public/s3799803.jpg', 25, 18, 0),
(112, '了不起的盖茨比', '菲茨杰拉德', '9787544294300', '南海出版公司', '2019-08-01', '文学/小说', '美国梦的破灭，经典文学代表作。', 'https://img9.doubanio.com/view/subject/s/public/s3799804.jpg', 28, 20, 0),
(113, '傲慢与偏见', '简·奥斯汀', '9787544294317', '南海出版公司', '2019-09-01', '文学/小说', '经典爱情小说，探讨阶级与爱情。', 'https://img9.doubanio.com/view/subject/s/public/s3799805.jpg', 30, 22, 0),
(114, '简·爱', '夏洛蒂·勃朗特', '9787544294331', '南海出版公司', '2019-10-01', '文学/小说', '女性独立的经典，讲述简·爱的成长与爱情。', 'https://img9.doubanio.com/view/subject/s/public/s3799806.jpg', 28, 20, 0),
(115, '呼啸山庄', '艾米莉·勃朗特', '9787544294348', '南海出版公司', '2019-11-01', '文学/小说', '充满野性与激情的经典爱情小说。', 'https://img9.doubanio.com/view/subject/s/public/s3799807.jpg', 25, 18, 0),
(116, '红与黑', '司汤达', '9787544294362', '南海出版公司', '2019-12-01', '文学/小说', '批判现实主义经典，讲述底层青年的奋斗与悲剧。', 'https://img9.doubanio.com/view/subject/s/public/s3799808.jpg', 28, 20, 0),
(117, '悲惨世界', '雨果', '9787544294379', '南海出版公司', '2020-01-01', '文学/小说', '人道主义经典，讲述救赎与希望。', 'https://img9.doubanio.com/view/subject/s/public/s3799809.jpg', 30, 22, 0),
(118, '巴黎圣母院', '雨果', '9787544294393', '南海出版公司', '2020-02-01', '文学/小说', '讲述美与丑、善与恶的经典。', 'https://img9.doubanio.com/view/subject/s/public/s3799810.jpg', 28, 20, 0),
(119, '战争与和平', '列夫·托尔斯泰', '9787544294409', '南海出版公司', '2020-03-01', '文学/小说', '史诗级经典，讲述俄国社会的变迁。', 'https://img9.doubanio.com/view/subject/s/public/s3799811.jpg', 25, 18, 0),
(120, '安娜·卡列尼娜', '列夫·托尔斯泰', '9787544294423', '南海出版公司', '2020-04-01', '文学/小说', '探讨爱情与婚姻的经典。', 'https://img9.doubanio.com/view/subject/s/public/s3799812.jpg', 28, 20, 0),
(121, '罪与罚', '陀思妥耶夫斯基', '9787544294430', '南海出版公司', '2020-05-01', '文学/小说', '探讨人性与道德的经典。', 'https://img9.doubanio.com/view/subject/s/public/s3799813.jpg', 25, 18, 0),
(122, '卡拉马佐夫兄弟', '陀思妥耶夫斯基', '9787544294447', '南海出版公司', '2020-06-01', '文学/小说', '陀思妥耶夫斯基巅峰之作，探讨人性与信仰。', 'https://img9.doubanio.com/view/subject/s/public/s3799814.jpg', 22, 15, 0),
(123, '变形记', '卡夫卡', '9787544294461', '南海出版公司', '2020-07-01', '文学/小说', '荒诞派经典，讲述人性的异化。', 'https://img9.doubanio.com/view/subject/s/public/s3799815.jpg', 25, 18, 0),
(124, '百年孤独（精装版）', '加西亚·马尔克斯', '9787544294478', '南海出版公司', '2020-08-01', '文学/小说', '精装典藏版，新增注释与导读。', 'https://img9.doubanio.com/view/subject/s/public/s3799816.jpg', 22, 15, 0),
(125, '生命不能承受之轻', '米兰·昆德拉', '9787544294492', '南海出版公司', '2020-09-01', '文学/小说', '探讨生命的意义与选择。', 'https://img9.doubanio.com/view/subject/s/public/s3799817.jpg', 25, 18, 0),
(126, '追忆似水年华', '普鲁斯特', '9787544294508', '南海出版公司', '2020-10-01', '文学/小说', '意识流文学的巅峰之作。', 'https://img9.doubanio.com/view/subject/s/public/s3799818.jpg', 22, 15, 0),
(127, '存在与时间', '海德格尔', '9787100165589', '商务印书馆', '2019-12-01', '哲学/经典', '存在主义哲学的经典著作。', 'https://img9.doubanio.com/view/subject/s/public/s4072177.jpg', 18, 10, 0),
(128, '苏菲的世界', '乔斯坦·贾德', '9787544294522', '南海出版公司', '2020-11-01', '哲学/通俗', '以小说形式讲述西方哲学史，入门经典。', 'https://img9.doubanio.com/view/subject/s/public/s3799819.jpg', 30, 22, 0),
(129, '西方哲学史', '罗素', '9787100077840', '商务印书馆', '2019-07-01', '哲学/经典', '全面讲述西方哲学的发展历程。', 'https://img9.doubanio.com/view/subject/s/public/s4072178.jpg', 25, 18, 0),
(130, '中国哲学简史', '冯友兰', '9787100183457', '商务印书馆', '2020-08-01', '哲学/经典', '简明扼要的中国哲学史，入门必读。', 'https://img9.doubanio.com/view/subject/s/public/s4072179.jpg', 28, 20, 0),
(131, '谈美', '朱光潜', '9787100183464', '商务印书馆', '2020-09-01', '美学/经典', '朱光潜美学入门，通俗易懂。', 'https://img9.doubanio.com/view/subject/s/public/s4072180.jpg', 25, 18, 0),
(132, '美的历程', '李泽厚', '9787108069113', '生活·读书·新知三联书店', '2021-01-01', '美学/经典', '讲述中国美学的发展历程。', 'https://img9.doubanio.com/view/subject/s/public/s4072181.jpg', 22, 15, 0),
(133, '乡土中国', '费孝通', '9787108069120', '生活·读书·新知三联书店', '2021-02-01', '社会学/经典', '讲述中国乡村社会的结构与特点。', 'https://img9.doubanio.com/view/subject/s/public/s4072182.jpg', 30, 22, 0),
(134, '乌合之众（精装版）', '古斯塔夫·勒庞', '9787510886843', '九州出版社', '2021-03-01', '心理学/社会', '精装典藏版，新增解读与注释。', 'https://img9.doubanio.com/view/subject/s/public/s4072183.jpg', 22, 15, 0),
(135, '梦的解析', '弗洛伊德', '9787100191000', '商务印书馆', '2021-04-01', '心理学/经典', '精神分析的经典，解读梦境的意义。', 'https://img9.doubanio.com/view/subject/s/public/s4072184.jpg', 25, 18, 0),
(136, '精神分析引论', '弗洛伊德', '9787100191017', '商务印书馆', '2021-05-01', '心理学/经典', '精神分析的入门教材。', 'https://img9.doubanio.com/view/subject/s/public/s4072185.jpg', 22, 15, 0),
(137, '爱的艺术', '弗洛姆', '9787544785884', '译林出版社', '2021-06-01', '心理学/情感', '探讨爱的本质，如何学会爱。', 'https://img9.doubanio.com/view/subject/s/public/s4072186.jpg', 28, 20, 0),
(138, '自卑与超越', '阿德勒', '9787544785891', '译林出版社', '2021-07-01', '心理学/成长', '阿德勒心理学经典，超越自卑实现成长。', 'https://img9.doubanio.com/view/subject/s/public/s4072187.jpg', 30, 22, 0),
(139, '心理学与生活', '理查德·格里格', '9787115409362', '人民邮电出版社', '2021-08-01', '心理学/教材', '心理学入门经典教材，覆盖全领域。', 'https://img9.doubanio.com/view/subject/s/public/s4072188.jpg', 25, 18, 0),
(140, '社会心理学', '戴维·迈尔斯', '9787115578012', '人民邮电出版社', '2021-09-01', '心理学/教材', '社会心理学经典教材，通俗易懂。', 'https://img9.doubanio.com/view/subject/s/public/s4072189.jpg', 28, 20, 0),
(141, 'TypeScript实战', '梁宵', '9787115599997', '人民邮电出版社', '2022-02-01', '计算机/编程', 'TypeScript从入门到实战，覆盖前端工程化。', 'https://img9.doubanio.com/view/subject/s/public/s4072190.jpg', 22, 15, 0),
(142, 'Vue3实战指南', '王红元', '9787115599987', '人民邮电出版社', '2022-03-01', '计算机/编程', 'Vue3核心特性与实战，覆盖组合式API。', 'https://img9.doubanio.com/view/subject/s/public/s4072191.jpg', 25, 18, 0),
(143, 'React设计模式与最佳实践', 'Michele Bertoli', '9787115599970', '人民邮电出版社', '2022-04-01', '计算机/编程', 'React高级设计模式，提升代码质量。', 'https://img9.doubanio.com/view/subject/s/public/s4072192.jpg', 22, 15, 0),
(144, 'Next.js实战', '赵帅', '9787115599963', '人民邮电出版社', '2022-05-01', '计算机/编程', 'Next.js服务端渲染与静态生成实战。', 'https://img9.doubanio.com/view/subject/s/public/s4072193.jpg', 20, 12, 0),
(145, 'Nuxt.js实战', '李松峰', '9787115599956', '人民邮电出版社', '2022-06-01', '计算机/编程', 'Nuxt.js框架实战，Vue服务端渲染最佳实践。', 'https://img9.doubanio.com/view/subject/s/public/s4072194.jpg', 20, 12, 0),
(146, 'Docker实战', 'Sean P. Kane', '9787115599949', '人民邮电出版社', '2022-07-01', '计算机/容器', 'Docker容器化部署实战，从入门到精通。', 'https://img9.doubanio.com/view/subject/s/public/s4072195.jpg', 25, 18, 0),
(147, 'Kubernetes实战', 'Brendan Burns', '9787115599932', '人民邮电出版社', '2022-08-01', '计算机/容器', 'K8s容器编排实战，云原生架构核心。', 'https://img9.doubanio.com/view/subject/s/public/s4072196.jpg', 22, 15, 0),
(148, 'Git权威指南', '蒋鑫', '9787115599925', '人民邮电出版社', '2022-09-01', '计算机/工具', 'Git版本控制权威指南，覆盖所有核心操作。', 'https://img9.doubanio.com/view/subject/s/public/s4072197.jpg', 28, 20, 0),
(149, 'Linux鸟哥的私房菜', '鸟哥', '9787115599918', '人民邮电出版社', '2022-10-01', '计算机/系统', 'Linux入门经典，覆盖系统管理与运维。', 'https://img9.doubanio.com/view/subject/s/public/s4072198.jpg', 30, 22, 0),
(150, 'Shell编程实战', '张昊', '9787115599901', '人民邮电出版社', '2022-11-01', '计算机/脚本', 'Shell脚本编程实战，自动化运维必备技能，覆盖bash、awk、sed核心用法。', 'https://img9.doubanio.com/view/subject/s/public/s4072199.jpg', 25, 18, 0),
 (151, 'Nginx高性能配置实战', '陶辉', '9787115599895', '人民邮电出版社', '2022-12-01', '计算机/服务器', 'Nginx高性能部署与优化，负载均衡、反向代理实战指南。', 'https://img9.doubanio.com/view/subject/s/public/s4072200.jpg', 22, 15, 0),
 (152, 'Elasticsearch实战', 'Clinton Gormley', '9787115599888', '人民邮电出版社', '2023-01-01', '计算机/搜索引擎', 'Elasticsearch分布式搜索与分析，日志收集、全文检索实战。', 'https://img9.doubanio.com/view/subject/s/public/s4072201.jpg', 20, 12, 0),
 (153, 'MongoDB实战', 'Kristina Chodorow', '9787115599871', '人民邮电出版社', '2023-02-01', '计算机/数据库', 'MongoDB非关系型数据库实战，文档存储、高并发处理。', 'https://img9.doubanio.com/view/subject/s/public/s4072202.jpg', 22, 15, 0),
 (154, 'Flutter实战', '杜文亮', '9787115599864', '人民邮电出版社', '2023-03-01', '计算机/移动开发', 'Flutter跨平台应用开发，iOS与Android统一开发方案。', 'https://img9.doubanio.com/view/subject/s/public/s4072203.jpg', 28, 20, 0),
 (155, 'React Native实战', '周林', '9787115599857', '人民邮电出版社', '2023-04-01', '计算机/移动开发', 'React Native跨平台开发，原生体验的移动应用构建。', 'https://img9.doubanio.com/view/subject/s/public/s4072204.jpg', 25, 18, 0),
 (156, '微服务架构实战', '周立', '9787115599840', '人民邮电出版社', '2023-05-01', '计算机/架构', '微服务拆分、服务注册发现、分布式事务实战。', 'https://img9.doubanio.com/view/subject/s/public/s4072205.jpg', 22, 15, 0),
 (157, 'Spring Cloud实战', '翟永超', '9787115599833', '人民邮电出版社', '2023-06-01', '计算机/框架', 'Spring Cloud微服务生态，服务治理、配置中心实战。', 'https://img9.doubanio.com/view/subject/s/public/s4072206.jpg', 28, 20, 0),
 (158, 'Dubbo实战', '梁勇', '9787115599826', '人民邮电出版社', '2023-07-01', '计算机/框架', 'Dubbo分布式服务框架，高性能RPC调用实战。', 'https://img9.doubanio.com/view/subject/s/public/s4072207.jpg', 22, 15, 0),
 (159, '消息队列实战', '王磊', '9787115599819', '人民邮电出版社', '2023-08-01', '计算机/中间件', 'RabbitMQ、Kafka消息队列实战，异步通信、削峰填谷。', 'https://img9.doubanio.com/view/subject/s/public/s4072208.jpg', 25, 18, 0),
 (160, '分布式系统设计原理', 'Martin Kleppmann', '9787115599802', '人民邮电出版社', '2023-09-01', '计算机/架构', '分布式系统核心原理，一致性、可用性、分区容错性。', 'https://img9.doubanio.com/view/subject/s/public/s4072209.jpg', 20, 12, 0),
 (161, '数据结构与算法分析', 'Mark Allen Weiss', '9787115599796', '人民邮电出版社', '2023-10-01', '计算机/算法', '数据结构与算法经典教材，时间复杂度与空间复杂度分析。', 'https://img9.doubanio.com/view/subject/s/public/s4072210.jpg', 28, 20, 0),
 (162, '机器学习实战', 'Peter Harrington', '9787115599789', '人民邮电出版社', '2023-11-01', '计算机/AI', '机器学习算法实战，Python实现决策树、神经网络等。', 'https://img9.doubanio.com/view/subject/s/public/s4072211.jpg', 25, 18, 0),
 (163, 'TensorFlow实战', '黄文坚', '9787115599772', '人民邮电出版社', '2023-12-01', '计算机/AI', 'TensorFlow深度学习框架实战，图像识别、自然语言处理。', 'https://img9.doubanio.com/view/subject/s/public/s4072212.jpg', 22, 15, 0),
 (164, 'PyTorch实战', '尹相楠', '9787115599765', '人民邮电出版社', '2024-01-01', '计算机/AI', 'PyTorch深度学习框架实战，动态图编程、模型训练。', 'https://img9.doubanio.com/view/subject/s/public/s4072213.jpg', 28, 20, 0),
 (165, '自然语言处理实战', '何晗', '9787115599758', '人民邮电出版社', '2024-02-01', '计算机/AI', 'NLP核心技术，分词、词性标注、情感分析实战。', 'https://img9.doubanio.com/view/subject/s/public/s4072214.jpg', 25, 18, 0),
 (166, '计算机视觉实战', '李云帆', '9787115599741', '人民邮电出版社', '2024-03-01', '计算机/AI', '计算机视觉核心技术，OpenCV、图像识别、目标检测实战。', 'https://img9.doubanio.com/view/subject/s/public/s4072215.jpg', 22, 15, 0),
 (167, '大数据处理实战', '林子雨', '9787115599734', '人民邮电出版社', '2024-04-01', '计算机/大数据', 'Hadoop、Spark大数据处理框架，离线计算、实时计算实战。', 'https://img9.doubanio.com/view/subject/s/public/s4072216.jpg', 25, 18, 0),
 (168, 'Flink实战', '张利兵', '9787115599727', '人民邮电出版社', '2024-05-01', '计算机/大数据', 'Flink实时计算框架，流处理、批处理一体化实战。', 'https://img9.doubanio.com/view/subject/s/public/s4072217.jpg', 22, 15, 0),
 (169, '数据仓库实战', '王进', '9787115599710', '人民邮电出版社', '2024-06-01', '计算机/大数据', '数据仓库建模、ETL流程、数仓分层设计实战。', 'https://img9.doubanio.com/view/subject/s/public/s4072218.jpg', 20, 12, 0),
 (170, '数据可视化实战', '陈为', '9787115599703', '人民邮电出版社', '2024-07-01', '计算机/大数据', 'ECharts、Tableau数据可视化，大屏展示、报表设计实战。', 'https://img9.doubanio.com/view/subject/s/public/s4072219.jpg', 25, 18, 0),
 (171, '网络安全实战', '杨波', '9787115599697', '人民邮电出版社', '2024-08-01', '计算机/安全', '网络安全攻防、渗透测试、漏洞挖掘实战。', 'https://img9.doubanio.com/view/subject/s/public/s4072220.jpg', 22, 15, 0),
 (172, '渗透测试实战', '蔡晶晶', '9787115599680', '人民邮电出版社', '2024-09-01', '计算机/安全', 'Web渗透、主机渗透、社会工程学实战。', 'https://img9.doubanio.com/view/subject/s/public/s4072221.jpg', 20, 12, 0),
 (173, '代码审计实战', '王清', '9787115599673', '人民邮电出版社', '2024-10-01', '计算机/安全', 'PHP、Java代码审计，漏洞发现与修复实战。', 'https://img9.doubanio.com/view/subject/s/public/s4072222.jpg', 22, 15, 0);


-- ========== 1. 文学/科幻/悬疑类（category=art） ==========
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=1' WHERE `id` = 1; -- 三体（科幻）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=2' WHERE `id` = 2; -- 活着（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=3' WHERE `id` = 3; -- 百年孤独（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=4' WHERE `id` = 4; -- 白夜行（悬疑）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=5' WHERE `id` = 5; -- 红楼梦（古典文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=6' WHERE `id` = 6; -- 解忧杂货店（温情）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=7' WHERE `id` = 7; -- 三体II（科幻）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=8' WHERE `id` = 8; -- 三体III（科幻）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=9' WHERE `id` = 9; -- 追风筝的人（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=10' WHERE `id` = 10; -- 平凡的世界（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=11' WHERE `id` = 11; -- 小王子（儿童文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=12' WHERE `id` = 12; -- 西游记（古典文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=13' WHERE `id` = 13; -- 围城（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=14' WHERE `id` = 14; -- 嫌疑人X的献身（悬疑）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=15' WHERE `id` = 15; -- 恶意（悬疑）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=16' WHERE `id` = 16; -- 骆驼祥子（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=17' WHERE `id` = 17; -- 茶馆（戏剧）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=18' WHERE `id` = 18; -- 城南旧事（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=19' WHERE `id` = 19; -- 活着本来单纯（散文）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=20' WHERE `id` = 20; -- 白夜行（精装版）（悬疑）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=97' WHERE `id` = 97; -- 三体中的物理学（科幻/科普）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=99' WHERE `id` = 99; -- 海底两万里（科幻）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=100' WHERE `id` = 100; -- 流浪地球（科幻）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=101' WHERE `id` = 101; -- 沙丘（科幻）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=102' WHERE `id` = 102; -- 银河帝国：基地（科幻）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=103' WHERE `id` = 103; -- 2001太空漫游（科幻）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=104' WHERE `id` = 104; -- 阿西莫夫科幻小说集（科幻）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=105' WHERE `id` = 105; -- 解忧杂货店新版（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=106' WHERE `id` = 106; -- 云边有个小卖部（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=107' WHERE `id` = 107; -- 人间失格（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=108' WHERE `id` = 108; -- 挪威的森林（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=109' WHERE `id` = 109; -- 霍乱时期的爱情（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=110' WHERE `id` = 110; -- 局外人（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=111' WHERE `id` = 111; -- 麦田里的守望者（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=112' WHERE `id` = 112; -- 了不起的盖茨比（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=113' WHERE `id` = 113; -- 傲慢与偏见（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=114' WHERE `id` = 114; -- 简·爱（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=115' WHERE `id` = 115; -- 呼啸山庄（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=116' WHERE `id` = 116; -- 红与黑（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=117' WHERE `id` = 117; -- 悲惨世界（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=118' WHERE `id` = 118; -- 巴黎圣母院（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=119' WHERE `id` = 119; -- 战争与和平（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=120' WHERE `id` = 120; -- 安娜·卡列尼娜（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=121' WHERE `id` = 121; -- 罪与罚（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=122' WHERE `id` = 122; -- 卡拉马佐夫兄弟（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=123' WHERE `id` = 123; -- 变形记（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=124' WHERE `id` = 124; -- 百年孤独精装版（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=125' WHERE `id` = 125; -- 生命不能承受之轻（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=126' WHERE `id` = 126; -- 追忆似水年华（文学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=art&img=131' WHERE `id` = 131; -- 谈美（美学）

-- ========== 2. 计算机/人工智能/数据库类（category=technics） ==========
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=21' WHERE `id` = 21; -- 算法导论（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=22' WHERE `id` = 22; -- Python编程：从入门到实践（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=23' WHERE `id` = 23; -- Java编程思想（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=24' WHERE `id` = 24; -- JavaScript高级程序设计（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=25' WHERE `id` = 25; -- 深入浅出Vue.js（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=26' WHERE `id` = 26; -- 设计模式（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=27' WHERE `id` = 27; -- 代码大全（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=28' WHERE `id` = 28; -- 人月神话（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=29' WHERE `id` = 29; -- 深度学习（人工智能）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=30' WHERE `id` = 30; -- 计算机网络（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=31' WHERE `id` = 31; -- 剑指Offer（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=32' WHERE `id` = 32; -- 高性能MySQL（数据库）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=33' WHERE `id` = 33; -- Redis设计与实现（数据库）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=34' WHERE `id` = 34; -- 流畅的Python（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=35' WHERE `id` = 35; -- 重构（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=36' WHERE `id` = 36; -- Clean Code（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=37' WHERE `id` = 37; -- 深入理解计算机系统（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=38' WHERE `id` = 38; -- 数据库系统概念（数据库）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=39' WHERE `id` = 39; -- 编译原理（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=40' WHERE `id` = 40; -- 操作系统概念（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=41' WHERE `id` = 41; -- 黑客与画家（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=42' WHERE `id` = 42; -- C++ Primer（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=43' WHERE `id` = 43; -- Effective Java（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=44' WHERE `id` = 44; -- Go程序设计语言（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=45' WHERE `id` = 45; -- Node.js实战（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=46' WHERE `id` = 46; -- React学习手册（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=47' WHERE `id` = 47; -- Spring实战（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=48' WHERE `id` = 48; -- MyBatis从入门到精通（数据库）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=49' WHERE `id` = 49; -- 微服务架构设计模式（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=50' WHERE `id` = 50; -- 架构整洁之道（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=132' WHERE `id` = 132; -- Linux鸟哥的私房菜（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=133' WHERE `id` = 133; -- Shell编程实战（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=134' WHERE `id` = 134; -- Nginx高性能配置实战（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=135' WHERE `id` = 135; -- Elasticsearch实战（数据库）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=136' WHERE `id` = 136; -- MongoDB实战（数据库）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=137' WHERE `id` = 137; -- Flutter实战（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=138' WHERE `id` = 138; -- React Native实战（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=139' WHERE `id` = 139; -- 微服务架构实战（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=140' WHERE `id` = 140; -- Spring Cloud实战（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=141' WHERE `id` = 141; -- Dubbo实战（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=142' WHERE `id` = 142; -- 消息队列实战（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=143' WHERE `id` = 143; -- 分布式系统设计原理（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=144' WHERE `id` = 144; -- 数据结构与算法分析（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=145' WHERE `id` = 145; -- 机器学习实战（人工智能）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=146' WHERE `id` = 146; -- TensorFlow实战（人工智能）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=147' WHERE `id` = 147; -- PyTorch实战（人工智能）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=148' WHERE `id` = 148; -- 自然语言处理实战（人工智能）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=149' WHERE `id` = 149; -- 计算机视觉实战（人工智能）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=150' WHERE `id` = 150; -- 大数据处理实战（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=151' WHERE `id` = 151; -- Flink实战（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=152' WHERE `id` = 152; -- 数据仓库实战（数据库）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=153' WHERE `id` = 153; -- 数据可视化实战（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=154' WHERE `id` = 154; -- 网络安全实战（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=155' WHERE `id` = 155; -- 渗透测试实战（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=156' WHERE `id` = 156; -- 代码审计实战（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=157' WHERE `id` = 157; -- Spring Cloud实战（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=158' WHERE `id` = 158; -- Dubbo实战（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=159' WHERE `id` = 159; -- 消息队列实战（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=160' WHERE `id` = 160; -- 分布式系统设计原理（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=161' WHERE `id` = 161; -- 数据结构与算法分析（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=162' WHERE `id` = 162; -- 机器学习实战（人工智能）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=163' WHERE `id` = 163; -- TensorFlow实战（人工智能）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=164' WHERE `id` = 164; -- PyTorch实战（人工智能）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=165' WHERE `id` = 165; -- 自然语言处理实战（人工智能）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=166' WHERE `id` = 166; -- 计算机视觉实战（人工智能）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=167' WHERE `id` = 167; -- 大数据处理实战（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=168' WHERE `id` = 168; -- Flink实战（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=169' WHERE `id` = 169; -- 数据仓库实战（数据库）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=170' WHERE `id` = 170; -- 数据可视化实战（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=171' WHERE `id` = 171; -- 网络安全实战（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=172' WHERE `id` = 172; -- 渗透测试实战（计算机）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=technics&img=173' WHERE `id` = 173; -- 代码审计实战（计算机）

-- ========== 3. 心理学类（category=people） ==========
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=people&img=51' WHERE `id` = 51; -- 思考快与慢（心理学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=people&img=52' WHERE `id` = 52; -- 影响力（心理学/营销）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=people&img=62' WHERE `id` = 62; -- 刻意练习（心理学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=people&img=63' WHERE `id` = 63; -- 非暴力沟通（心理学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=people&img=64' WHERE `id` = 64; -- 被讨厌的勇气（心理学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=people&img=65' WHERE `id` = 65; -- 蛤蟆先生去看心理医生（心理学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=people&img=66' WHERE `id` = 66; -- 认知觉醒（心理学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=people&img=67' WHERE `id` = 67; -- 心流（心理学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=people&img=68' WHERE `id` = 68; -- 少有人走的路（心理学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=people&img=69' WHERE `id` = 69; -- 乌合之众（心理学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=people&img=70' WHERE `id` = 70; -- 怪诞行为学（心理学）

-- ========== 4. 经管/营销/理财类（category=business） ==========
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=business&img=53' WHERE `id` = 53; -- 原则（经管）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=business&img=54' WHERE `id` = 54; -- 穷查理宝典（经管）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=business&img=57' WHERE `id` = 57; -- 富爸爸穷爸爸（理财）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=business&img=58' WHERE `id` = 58; -- 穷爸爸富爸爸实践篇（理财）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=business&img=59' WHERE `id` = 59; -- 小狗钱钱（理财）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=business&img=60' WHERE `id` = 60; -- 财富自由之路（理财）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=business&img=61' WHERE `id` = 61; -- 高效能人士的七个习惯（经管）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=business&img=71' WHERE `id` = 71; -- 流量池（营销）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=business&img=72' WHERE `id` = 72; -- 定位（营销）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=business&img=73' WHERE `id` = 73; -- 爆款文案（营销）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=business&img=74' WHERE `id` = 74; -- 精益创业（经管）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=business&img=75' WHERE `id` = 75; -- 从零到一（经管）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=business&img=76' WHERE `id` = 76; -- 商业模式新生代（经管）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=business&img=77' WHERE `id` = 77; -- 卓有成效的管理者（经管）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=business&img=78' WHERE `id` = 78; -- 管理的实践（经管）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=business&img=79' WHERE `id` = 79; -- 巴菲特致股东的信（理财）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=business&img=80' WHERE `id` = 80; -- 指数基金定投（理财）

-- ========== 5. 历史类（category=travel） ==========
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=travel&img=55' WHERE `id` = 55; -- 人类简史（历史）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=travel&img=56' WHERE `id` = 56; -- 明朝那些事儿（历史）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=travel&img=81' WHERE `id` = 81; -- 中国通史（历史）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=travel&img=82' WHERE `id` = 82; -- 全球通史（历史）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=travel&img=83' WHERE `id` = 83; -- 史记（历史）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=travel&img=84' WHERE `id` = 84; -- 资治通鉴（历史）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=travel&img=85' WHERE `id` = 85; -- 万历十五年（历史）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=travel&img=86' WHERE `id` = 86; -- 大秦帝国（历史）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=travel&img=87' WHERE `id` = 87; -- 二千年间（历史）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=travel&img=88' WHERE `id` = 88; -- 三国史话（历史）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=travel&img=89' WHERE `id` = 89; -- 耶路撒冷三千年（历史）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=travel&img=90' WHERE `id` = 90; -- 枪炮、病菌与钢铁（历史/科普）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=travel&img=95' WHERE `id` = 95; -- 人类群星闪耀时（历史）

-- ========== 6. 科普类（category=nature） ==========
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=nature&img=91' WHERE `id` = 91; -- 时间简史（科普）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=nature&img=92' WHERE `id` = 92; -- 果壳中的宇宙（科普）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=nature&img=93' WHERE `id` = 93; -- 万物简史（科普）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=nature&img=94' WHERE `id` = 94; -- 自私的基因（科普）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=nature&img=96' WHERE `id` = 96; -- 从一到无穷大（科普）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=nature&img=98' WHERE `id` = 98; -- 昆虫记（科普）

-- ========== 7. 哲学类（category=backgrounds） ==========
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=backgrounds&img=127' WHERE `id` = 127; -- 存在与时间（哲学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=backgrounds&img=128' WHERE `id` = 128; -- 苏菲的世界（哲学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=backgrounds&img=129' WHERE `id` = 129; -- 西方哲学史（哲学）
UPDATE `book` SET `cover_url` = 'https://picsum.photos/800/1000?category=backgrounds&img=130' WHERE `id` = 130; -- 中国哲学简史（哲学）