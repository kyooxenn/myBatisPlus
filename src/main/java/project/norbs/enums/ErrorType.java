package project.norbs.enums;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorType {
	UnhandledRejection("UnhandledRejectionError", "未知错误"),
	ValidationFailed("ValidationFailedError", "验证失败"),
	Unauthorized("UnauthorizedError", "身份验证失败，请重新登录"),
	PermissionDenied("PermissionDeniedError", "你没有权限进行此操作", HttpStatus.FORBIDDEN),
	UsernameDuplicated("UsernameDuplicatedError", "该用户名已被占用"),
	PlayerNotFound("PlayerNotFoundError", "未找到指定玩家", HttpStatus.NOT_FOUND),
	PayAccountDuplicated("PayAccountDuplicatedError", "银行账号重复"),
	PayPlatformDuplicated("PayPlatformDuplicatedError", "支付商重复"),
	InvalidBankInfo("InvalidBankInfoError", "银行信息无效"),
	AddBankCardFailed("AddBankCardFailedError", "新增银行卡失败"),
	DuplicatedCardAccount("DuplicatedCardAccountError", "银行卡号已被使用"),
	UpdateBankcardFailed("UpdateBankcardFailedError", "更新银行卡失败"),
	InvalidCardId("InvalidCardIdError", "无效的银行卡 id"),
	DeleteBankcardFailed("DeleteBankcardFailedError", "删除银行卡失败"),
	ScopeDuplicated("ScopeDuplicatedError", "角色名重复"),
	ScopeNotEmpty("ScopeNotEmptyError", "有其他子账号正在使用该角色，不得删除"),
	DeleteScopeFailed("DeleteScopeFailedError", "删除角色失败"),
	CreateSubAccountFailed("CreateSubAccountFailedError", "新增子帐号失败"),
	AccountDuplicated("AccountDuplicatedError", "子帐号名重复"),
	UpdateSubAccountFailed("UpdateSubAccountFailedError", "更新子帐号失败"),
	DeleteSubAccountFailed("DeleteSubAccountFailedError", "删除子账号失败"),
	SubAccountNotFound("SubAccountNotFoundError", "未找到指定子账号", HttpStatus.NOT_FOUND),
	ResetPasswordFailed("ResetPasswordFailedError", "重置子账号密码失败"),
	CreateScopeFailed("CreateScopeFailedError", "新增角色失败"),
	UpdateScopeFailed("UpdateScopeFailedError", "更新角色失败"),
	ScopeNotFound("ScopeNotFoundError", "未找到指定角色", HttpStatus.NOT_FOUND),
	InvalidPayChannel("InvalidPayChannelError", "无效的支付渠道"),
	InvalidOrderInfo("InvalidOrderInfoError", "无效的订单信息"),
	DepositHandled("DepositHandledError", "该充值请求已被处理"),
	AccountNotFound("AccountNotFoundError", "未找到指定银行账号", HttpStatus.NOT_FOUND),
	InvalidDepositValue("InvalidDepositValueError", "无效的充值金额"),
	THTableNotFound("THTableNotFoundError", "找不到天豪方游戏记录资料表", HttpStatus.NOT_FOUND),
	WithdrawHandled("WithdrawHandledError", "该提现请求已被处理"),
	WithdrawNotApproved("WithdrawNotApprovedError", "只有已批准的提现才能审核交易结果"),
	UsernameUpdated("UsernameUpdatedError", "用户名只能修改一次"),
	GetDepositUrlFailed("GetDepositUrlFailedError", "获取支付地址失败"),
	TagDuplicated("TagDuplicatedError", "标签重复"),
	PlatformNotFound("PlatformNotFoundError", "未找到指定平台", HttpStatus.NOT_FOUND),
	InvalidSignature("InvalidSignatureError", "无效的签名"),
	CreateWithdrawFailed("CreateWithdrawFailedError", "创建提款失败"),
	InvalidData("InvalidDataError", "无效数据"),
	InvalidOrderStatus("InvalidOrderStatusError", "无效的订单状态"),
	InvalidPayPlatform("InvalidPayPlatformError", "支付平台出错，请稍后再试"),
	OrderNotFound("OrderNotFoundError", "找不到指定订单", HttpStatus.NOT_FOUND),
	ApiKeyRequired("ApiKeyRequiredError", "请传入密钥"),
	SchemeRequired("SchemeRequiredError", "请传入格式"),
	PayloadRequired("PayloadRequiredError", "请传入参与签名数据"),
	InvalidPlatformConfig("InvalidPlatformConfigError", "请正确配置支付平台"),
	BankNotSupported("BankNotSupportedError", "支付模组不支援此银行"),
	BankNotSupportedByPlatform("BankNotSupportedByPlatformError", "支付商尚未开通该银行"),
	ChannelNotSupported("ChannelNotSupportedError", "第三方支付平台不支援此渠道"),
	BankLocationNotRecognized("BankLocationNotRecognizedError", "无法识别银行所在地"),
	CurrencyNotSupprotedByPlatform("CurrencyNotSupprotedByPlatformError", "支付平台不支援此货币"),
	CurrencyNotSupproted("CurrencyNotSupprotedError", "支付模组不支援此货币"),
	EndpointNotFound("EndpointNotFoundError", "找不到支付平台接口位置", HttpStatus.NOT_FOUND),
	OperationNotSupportedByPlatform("OperationNotSupportedByPlatformError", "支付平台不支援此操作"),
	CurrencyNotSupported("CurrencyNotSupportedError", "整合平台模组不支援此货币"),
	InvalidNotifyInfo("InvalidNotifyInfoError", "无效的回调通知"),
	AddPayPlatformFailed("AddPayPlatformFailedError", "新增支付商失败"),
	PlatformMerchantDuplicated("PlatformMerchantDuplicatedError", "支付商商户号已被使用"),
	EditPayPlatformFailed("EditPayPlatformFailedError", "编辑支付商失败"),
	DeletePayPlatformFailed("DeletePayPlatformFailedError", "删除支付商失败"),
	ChangePasswordFailed("ChangePasswordFailedError", "更新密码失败"),
	PasswordNotChanged("PasswordNotChangedError", "新旧密码不可相同"),
	CreateAccountFailed("CreateAccountFailedError", "创建收款账号失败"),
	UpdateAccountFailed("UpdateAccountFailedError", "更新收款账号失败"),
	DeleteAccountFailed("DeleteAccountFailedError", "删除收款账号失败"),
	DepositNotFound("DepositNotFoundError", "未找到指定的充值请求", HttpStatus.NOT_FOUND),
	DepositFinished("DepositFinishedError", "该笔充值请求已结单"),
	WithdrawNotFound("WithdrawNotFoundError", "未找到指定提现请求", HttpStatus.NOT_FOUND),
	NoValidWithdrawPlatform("NoValidWithdrawPlatformError", "没有可用的出款平台"),
	WithdrawNotAllowed("WithdrawNotAllowedError", "该账号被禁止提现，请联系客服"),
	TimeIntervalRequired("TimeIntervalRequiredError", "请设置查询区间"),
	AddTagFailed("AddTagFailedError", "增加标签失败"),
	TagNotFound("TagNotFoundError", "未找到指定标签", HttpStatus.NOT_FOUND),
	InvalidTagOperator("InvalidTagOperatorError", "无效的标签操作符"),
	CreatePlayerFailed("CreatePlayerFailedError", "创建玩家失败"),
	WithdrawConditionNotReached("WithdrawConditionNotReachedError", "未达到提款条件"),
	OrderTooOften("OrderTooOftenError", "提交订单过于频繁，请稍后再试"),
	CreateOrderFailed("CreateOrderFailedError", "创建订单失败"),
	DailyMaxExceeded("DailyMaxExceededError", "已达每日最大存款限额"),
	NoEnoughBalance("NoEnoughBalanceError", "余额不足"),
	WithdrawSingleMaxExceeded("WithdrawSingleMaxExceededError", "无效的提款金额"),
	DailyCountMaxExceeded("DailyCountMaxExceededError", "已达每日最大提款次数"),
	WithdrawFailed("WithdrawFailedError", "提款失败"),
	PartnerAPIAccessFailed("PartnerAPIAccessFailedError", "协力 API 操作失败"),
	PartnerAPIResolveFailed("PartnerAPIResolveFailedError", "协力 API 解析失败"),
	UpdateNotifyPartnerFailed("UpdateNotifyPartnerFailedError", "更新协力通知结果失败"),
	OrderHasNotFinished("OrderHasNotFinishedError", "订单尚无交易结果"),
	AlreadyNotified("AlreadyNotifiedError", "已经成功通知过协力"),
	ResetPlayerPasswordFailed("ResetPlayerPasswordFailedError", "重置玩家登入密码失败"),
	CompanyDuplicated("CompanyDuplicatedError", "运营商重复"),
	CreateCompanyFailed("CreateCompanyFailedError", "创建运营商失败"),
	InvalidCompanyUsername("InvalidCompanyUsernameError", "无效的运营商用户名"),
	InvalidCompanyId("InvalidCompanyIdError", "无效的运营商 ID"),
	InvalidCompany("InvalidCompanyError", "无效的运营商"),
	InvalidParent("InvalidParentError", "无效的上级信息"),
	PayPlatformNotFound("PayPlatformNotFoundError", "找不到指定的支付商绑定信息", HttpStatus.NOT_FOUND),
	CompanyNotFound("CompanyNotFoundError", "找不到指定的运营商", HttpStatus.NOT_FOUND),
	UpdateCompanyFailed("UpdateCompanyFailedError", "更新运营商失败"),
	UpdateWhitelistEntryFailed("UpdateWhitelistEntryFailedError", "更新白名单失败"),
	AddWhitelistEntryFailed("AddWhitelistEntryFailedError", "增加白名单失败"),
	DeleteWhitelistEntryFailed("DeleteWhitelistEntryFailedError", "删除白名单失败"),
	IPNotAllowed("IPNotAllowedError", "访客 IP 不在白名单内", HttpStatus.FORBIDDEN),
	SetPlayerCountriesFailed("SetPlayerCountriesFailedError", "设置允许的玩家国家失败"),
	PlayerCountryIsNotAllowed("PlayerCountryIsNotAllowedError", "玩家不在可以使用服务的国家内"),
	OwnerIpNotAllowed("OwnerIpNotAllowedError", "当前 IP 不可使用管理后台", HttpStatus.FORBIDDEN),
	WrongPasword("WrongPaswordError", "旧密码不正确"),
	DuplicatedWhiteListIp("DuplicatedWhiteListIpError", "白名单内已设置了此 IP"),
	AddDomainFailed("AddDomainFailedError", "新增域名失败"),
	EditDomainFailed("EditDomainFailedError", "编辑域名失败"),
	DuplicatedDomain("DuplicatedDomainError", "此域名已被设置"),
	DeleteDomainFailed("DeleteDomainFailedError", "删除域名失败"),
	RecommandLowerThanMin("RecommandLowerThanMinError", "建议金额低于单笔最低限额"),
	RecommandHigherThanMax("RecommandHigherThanMaxError", "建议金额高于单笔最高限额"),
	SyncRangeTooBig("SyncRangeTooBigError", "同步区间太长"),
	DuplicatedRecommandAmout("DuplicatedRecommandAmoutError", "建议金额重复"),
	MissingQRCodeImage("MissingQRCodeImageError", "必须提供 QRCode 图片"),
	AddOfflineChannelFailed("AddOfflineChannelFailedError", "新增线下充值渠道失败"),
	EditOfflineChannelFailed("EditOfflineChannelFailedError", "编辑线下充值渠道失败"),
	GetOfflineChannelFailed("GetOfflineChannelFailedError", "查询线下充值渠道明细失败"),
	DeleteOfflineChannelFailed("DeleteOfflineChannelFailedError", "删除线下充值渠道失败"),
	ReviewPromotionFailed("ReviewPromotionFailedError", "审核活动失败"),
	InvalidPromotionAction("InvalidPromotionActionError", "无效的活动参加行为"),
	PromotionApplyNotReached("PromotionApplyNotReachedError", "尚未满足活动奖励条件"),
	InvalidUpdatePromotionStatus("InvalidUpdatePromotionStatusError", "不可编辑已经开始或过期的活动"),
	SubmitPromotionFailed("SubmitPromotionFailedError", "提交审核活动失败"),
	StartPromotionFailed("StartPromotionFailedError", "开始活动失败"),
	EndPromotionFailed("EndPromotionFailedError", "结束活动失败"),
	CancelPromotionFailed("CancelPromotionFailedError", "取消活动失败"),
	PromotionMonopolistic("PromotionMonopolisticError", "此活动不可叠加奖励"),
	PromotionTotalAttendLimitReached("PromotionTotalAttendLimitReachedError", "活动奖励申请次数已达上限"),
	InvalidAwardContent("InvalidAwardContentError", "无效的活动奖励内容"),
	AccumulatedPromotionEndTimeRequired("AccumulatedPromotionEndTimeRequiredError", "金额累积的活动需要结束日期"),
	BannerRequired("BannerRequiredError", "出现在广告位的活动需要上传图片"),
	InvalidImagePath("InvalidImagePathError", "图档位置错误"),
	EmptyOfflineAccount("EmptyOfflineAccountError", "未提供任何线下收款信息"),
	InvalidDividend("InvalidDividendError", "无效的分红"),
	InvalidDividendValue("InvalidDividendValueError", "后一条分红标准要大于前一条"),
	InvalidMaxDividendValue("InvalidMaxDividendValueError", "分红标准不可超过自己最大分红"),
	InvalidAvgBetAmount("InvalidAvgBetAmountError", "后一条分红规则日均销量不能低于前一条"),
	InvalidBetPlayerCount("InvalidBetPlayerCountError", "后一条分红规则有效投注人数不能低于前一条"),
	DividendLayerNeeded("DividendLayerNeededError", "后一条分红规则的日均销量和有效投注人数不能同时等于前一条"),
	OnlyAgentAllowed("OnlyAgentAllowedError", "只能为代理设置"),
	InvalidDividendPlayer("InvalidDividendPlayerError", "运营商无分红"),
	InvalidSalaryGap("InvalidSalaryGapError", "工资间隙设置下一级需要大于上一级"),
	InvalidSalaryLayer("InvalidSalaryLayerError", "无效的工资层级"),
	SalaryValueRequired("SalaryValueRequiredError", "请设置工资标准"),
	SalaryNotDivisibleByFive("SalaryNotDivisibleByFiveError", "工资标准请以0或5结尾"),
	SalaryUpperLimitExceeded("SalaryUpperLimitExceededError", "工资标准不可超过220"),
	InvalidSalaryValue("InvalidSalaryValueError", "下一级工资标准需要大于上一级"),
	InvalidSalaryBetAmount("InvalidSalaryBetAmountError", "下一级日均投注量不能低于上一级"),
	InvalidSalaryPlayerCount("InvalidSalaryPlayerCountError", "下一级有效投注人数不能低于上一级"),
	InvalidSalaryRank("InvalidSalaryRankError", "下一级投注量排名不能低于上一级"),
	SalaryLayerRequired("SalaryLayerRequiredError", "两个层级之间因素需要有间隔"),
	InvalidDividendLayer("InvalidDividendLayerError", "无效的分红层级"),
	DividendValueRequired("DividendValueRequiredError", "请设置分红标准"),
	DividendNotDivisibleByFive("DividendNotDivisibleByFiveError", "分红标准请以0或5结尾"),
	DividendUpperLimitExceeded("DividendUpperLimitExceededError", "分红标准不可超过220"),
	InvalidDividendBetAmount("InvalidDividendBetAmountError", "下一级日均投注量不能低于上一级"),
	InvalidDividendPlayerCount("InvalidDividendPlayerCountError", "下一级有效投注人数不能低于上一级"),
	InvalidDividendRank("InvalidDividendRankError", "下一级投注量排名不能低于上一级"),
	DividendLayerRequired("DividendLayerRequiredError", "两个层级之间因素需要有间隔"),
	QueryRangeTooLong("QueryRangeTooLongError", "查询区间超过 24 小时"),
	PromotionInactive("PromotionInactiveError", "活动已结束"),
	ApplyPromotionFailed("ApplyPromotionFailedError", "申请活动奖励失败"),
	PromotionAttendLimitReached("PromotionAttendLimitReachedError", "活动奖励申请次数已达上限"),
	PromotionAttendIntervalNotAchieved("PromotionAttendIntervalNotAchievedError", "尚未达到该活动再次申请时间"),
	PromotionApplyNotFound("PromotionApplyNotFoundError", "未找到指定活动奖励申请", HttpStatus.NOT_FOUND),
	PromotionApplyHandled("PromotionApplyHandledError", "此活动奖励申请已处理"),
	HandlePromotionApplyFailed("HandlePromotionApplyFailedError", "处理活动奖励申请失败"),
	ProviderDoesNotHaveDeskData("ProviderDoesNotHaveDeskDataError", "游戏源不支援牌桌记录"),
	DeskDataNotFound("DeskDataNotFoundError", "查无牌桌记录"),
	SetMaintainFailed("SetMaintainFailedError", "设置维护状态失败"),
	CreateAnnouncementFailed("CreateAnnouncementFailedError", "创建新公告失败"),
	DeleteAnnouncementFailed("DeleteAnnouncementFailedError", "删除公告失败"),
	AnnouncementNotFound("AnnouncementNotFoundError", "未找到指定公告", HttpStatus.NOT_FOUND),
	SetPromotionListOrderFailed("SetPromotionListOrderFailedError", "设定促销活动排序失败"),
	ExternalAgentIdRequired("ExternalAgentIdRequiredError", "请传入当前代理的自身代理ID"),
	InvalidExternalAgentId("InvalidExternalAgentIdError", "无效的代理外部 ID"),
	InvalidPlayerLevelSetting("InvalidPlayerLevelSettingError", "无效的玩家等级设置"),
	InvalidRebatePlatform("InvalidRebatePlatformError", "无效的洗码平台"),
	InvalidPlayerLevel("InvalidPlayerLevelError", "无效的玩家等级"),
	InvalidGap("InvalidGapError", "无效的金额区间"),
	InvalidPlayerRebateSetting("InvalidPlayerRebateSettingError", "无效的玩家洗码比例设置"),
	CannotAdjBalanceFrequently("CannotAdjBalanceFrequentlyError", "不可频繁修改用户余额"),
	SetupAgentAuthFailed("SetupAgentAuthFailedError", "设置可登入代理失败"),
	DisableAgentAuthFailed("DisableAgentAuthFailedError", "禁用代理登入失败"),
	AgentAuthIsRequired("AgentAuthIsRequiredError", "请先设置此代理为可登入"),
	ResetAgentPasswordFailed("ResetAgentPasswordFailedError", "重置代理登入密码失败"),
	SetCompanyWhiteIpFailed("SetCompanyWhiteIpFailedError", "设置运营商 IP 白名单失败"),
	SetAnnouncementListOrderFailed("SetAnnouncementListOrderFailedError", "设定公告排序失败"),
	ResetCompanyPwFailed("ResetCompanyPwFailedError", "重置运营商登入密码失败"),
	InvalidTHChannelId("InvalidTHChannelIdError", "无效的天豪渠道 ID"),
	InvalidTHDepositId("InvalidTHDepositIdError", "无效的天豪充值订单 ID"),
	InvalidTHWithdrawId("InvalidTHWithdrawIdError", "无效的天豪提现订单 ID"),
	InvalidPlayerId("InvalidPlayerIdError", "无效的天豪用户 ID"),
	InvalidAdAgent("InvalidAdAgentError", "推广报表不能查看运营商自己"),
	InvalidServiceUrlId("InvalidServiceUrlIdError", "无效的天豪客服连结 ID"),
	CompanyTHAccessCredentialNotFound("CompanyTHAccessCredentialNotFoundError", "找不到天豪系统介接信息"),
	ThirdApiAccessCredentialNotFound("ThirdApiAccessCredentialNotFoundError", "找不到第三方api介接信息"),
	THAPIDomainNotFound("THAPIDomainNotFoundError", "找不到天豪系统介接位置"),
	InvalidScopeRole("InvalidScopeRoleError", "增加的角色身份不正确"),
	PermissionExceedsLimit("PermissionExceedsLimitError", "角色的权限超过了允许的配置值"),
	InvalidScopeModule("InvalidScopeModuleError", "角色的模组配置数量不正确"),
	InvalidScopeSubModule("InvalidScopeSubModuleError", "角色的子模组配置数量不正确"),
	CompanyDoesNotOwnThisScope("CompanyDoesNotOwnThisScopeError", "当前运营商没有此角色的控制权"),
	CannotApplyScopeToThisRole("CannotApplyScopeToThisRoleError", "此角色不能套用在此身份"),
	SaveModeNotAllowedForAgent("SaveModeNotAllowedForAgentError", "代理不能使用此存款交易类型"),
	InvalidHornId("InvalidHornIdError", "无效的跑马灯 ID"),
	CannotUseCompanyAsAgent("CannotUseCompanyAsAgentError", "不可把运营商当作一般代理"),
	PromotionNotFound("PromotionNotFoundError", "找不到指定活动", HttpStatus.NOT_FOUND),
	CompanyIsBlocked("CompanyIsBlockedError", "运营商已被禁用"),
	PlayerPayBindingNotFound("PlayerPayBindingNotFoundError", "找不到指定的玩家支付绑定", HttpStatus.NOT_FOUND),
	SpreadUrlPlatformNotFound("SpreadUrlPlatformNotFoundError", "找不到运营商对应的推广连结平台键", HttpStatus.NOT_FOUND),
	AgentPerformLvExceedsCom("AgentPerformLvExceedsComError", "代理的主业绩层级不可以超过总代"),
	ThirdPerformLvExceedsCom("ThirdPerformLvExceedsComError", "代理的第三方业绩层级不可以超过总代"),
	InvalidTHPromotionCategoryId("InvalidTHPromotionCategoryIdError", "无效的天豪活动大类 ID"),
	InvalidTHPromotionSubId("InvalidTHPromotionSubIdError", "无效的天豪活动子类 ID"),
	ManualSaveOrOfferIsRequired("ManualSaveOrOfferIsRequiredError", "存款操作类型或者是优惠类型至少需要择一"),
	UploadImageIsRequired("UploadImageIsRequiredError", "必须提供要上传的图片"),
	CompanyIdIsRequired("CompanyIdIsRequiredError", "必须指定运营商"),
	InvalidCompanyGameId("InvalidCompanyGameIdError", "无效的运营商游戏 ID"),
	InvalidLogin("InvalidLoginError", "账号无效或密码错误"),
	UnknownOwnerIp("UnknownOwnerIpError", "未知的用户 IP"),
	TooManyFailedAttempts("TooManyFailedAttemptsError", "登入失败次数过多，暂时禁用此 IP"),
	AgentAlreadyExists("AgentAlreadyExistsError", "已经建立过此代理"),
	InvalidNoticId("InvalidNoticIdError", "无效的弹窗公告 ID"),
	InvalidMkId("InvalidMkIdError", "无效的码库 ID"),
	THAdminCredentialNotFound("THAdminCredentialNotFoundError", "管理者密钥不存在"),
	DuplicatedMainCommsSetting("DuplicatedMainCommsSettingError", "重复的主站佣金配置"),
	DuplicatedThirdCommsSetting("DuplicatedThirdCommsSettingError", "重复的第三方佣金配置"),
	InvalidMainCommsSetting("InvalidMainCommsSettingError", "无效的主站佣金配置"),
	InvalidThirdCommsSetting("InvalidThirdCommsSettingError", "无效的第三方佣金配置"),
	InvalidSortSetting("InvalidSortSettingError", "排序设置不正确"),
	InvalidSortChannelId("InvalidSortChannelIdError", "排序的渠道 ID 不正确"),
	OrderIsNeitherOnlineNorOffline("OrderIsNeitherOnlineNorOfflineError", "此订单不是线上也不是线下"),
	InvalidCompanyChannelData("InvalidCompanyChannelDataError", "运营商渠道类型信息有误"),
	MissingChannelRate("MissingChannelRateError", "运营商渠道优惠设置缺漏"),
	SystemIsBusy("SystemIsBusyError", "系统忙碌中，请稍后再操作"),
	AddAdAgentGroupFailed("AddAdAgentGroupFailedError", "新增推广代理组别失败"),
	DuplicatedAdAgentGroupName("DuplicatedAdAgentGroupNameError", "推广代理组别名称已被使用"),
	InvalidAdAgentGroupId("InvalidAdAgentGroupIdError", "无效的推广代理组别 ID"),
	EditAdAgentGroupFailed("EditAdAgentGroupFailedError", "编辑推广代理组别失败"),
	InitAdAgentHistGroupFailed("InitAdAgentHistGroupFailedError", "初始化搜索历史组别失败"),
	CannotDeleteHistGroup("CannotDeleteHistGroupError", "不能删除搜索历史组别"),
	CannotEditHistGroupName("CannotEditHistGroupNameError", "不能更名搜索历史组别"),
	UploadPhonesIsRequired("UploadPhonesIsRequiredError", "必须上传收件者手机号列表"),
	AddPlayerGroupFailed("AddPlayerGroupFailedError", "增加玩家组别失败"),
	DuplicatedPlayerGroupName("DuplicatedPlayerGroupNameError", "玩家组别名称已被使用"),
	EditPlayerGroupFailed("EditPlayerGroupFailedError", "编辑玩家组别失败"),
	CannotUseCompanyAsPlayer("CannotUseCompanyAsPlayerError", "不可把运营商当作一般玩家"),
	InitPlayerHistGroupFailed("InitPlayerHistGroupFailedError", "初始化搜索历史组别失败"),
	InvalidPlayerGroupId("InvalidPlayerGroupIdError", "无效的玩家组别 ID"),
	CanNotFountAccountId("CanNotFountAccountIdError","找不到该用户ID"),
	UploadUsrFileIsRequired("UploadUsrFileIsRequiredError", "必须上传玩家 ID 档案"),
	InvalidUsrsFileContent("InvalidUsrsFileContentError", "玩家 ID 档案内容格式不正确，必须是断行分隔的玩家 ID 数值"),
	FileTransferToError("FileTransferToError", "文件处理异常"),
	SetUpAgentAuthFailed("SetUpAgentAuthFailedError","更新代理资料失败"),
	InvalidPlayerIdError("InvalidPlayerIdError","玩家 ID 不正确"),
	ParamsFailedError("ParamsFailedError","参数错误"),
	UserNotFoundError("UserNotFoundError","用户不存在"),
	InvalidAccountEmailTempId("InvalidAccountEmailTempId", "无效的邮件模版ID"),
	ExpireTimeError("ExpireTimeError","过期时间异常"),
	SmsRewardMoneyError("smsRewardMoney","赠送金额错误"),
	InvalidExportError("InvalidExportError", "当前下载地址超过最大导出限制"),
	InvalidExportIPError("InvalidExportIPError", "当前IP超过最大导出限制"),
	InvalidExportUserError("InvalidExportUserError", "当前登录用户超过最大导出限制"),
	FeignError("FeignError", "feign接口调用失败"),

	FAILED("FAILED", "操作失败"),
	OtherUnhandledError("OtherUnhandledError", "其它未知错误"),
	MenuNotExistError("MenuNotExistError", "菜单信息不存在"),
	MenuCodedExistError("MenuNotExistError", "菜单权限编码存在"),
	MenuNameExistError("MenuNotExistError", "菜单名称已存在"),
	MenuExistSubError("MenuExistSubError", "菜单存在子菜单，请先删除子菜单"),
	MenuIdNotNullError("MenuIdNotNullError", "菜单ID不能为空"),
	MenuNameNotNullError("MenuNameNotNullError", "菜单名称/按钮名称不能为空"),
	MenuCodedNotNullError("MenuCodedNotNullError", "权限编码不能为空"),
	MenuRouteNotNullError("MenuRouteNotNullError", "路由信息不能为空"),
	MenuUrlNotNullError("MenuUrlNotNullError", "访问路径不能为空"),
	MenuSortNotNullError("MenuSortNotNullError", "排序号不能为空"),
	RoleIdNotNullError("RoleIdNotNullError", "角色ID不能为空"),
	RoleNameNotNullError("RoleNameNotNullError", "角色名称不能为空"),
	RoleNameLength6Error("RoleNameLength6Error", "角色名称最多6位"),
	RoleNotExistError("RoleNotExistError", "角色信息不存在"),
	RoleUsernameExistError("RoleUsernameExistError", "使用账号不存在"),
	RoleNameExistError("RoleNameExistError", "角色名称已存在"),
	RoleExistSubError("RoleExistSubError", "角色存在子角色，请先删除子角色"),
	RoleLevelMax5Error("RoleLevelMax5Error", "角色层级树最大5级"),
	RoleUsedAccountError("RoleUsedAccountError", "有其他子账号正在使用该角色，不得删除"),
	PlayerBoNotExistError("PlayerBoNotExistError", "账号信息不存在"),
	PlayerBoAccountIdNotNullError("PlayerBoAccountIdNotNullError", "账户ID不能为空"),
	PlayerBoUsernameExistError("PlayerBoUsernameExistError", "账号已存在"),
	PlayerBoUsernameNotNullError("PlayerBoUsernameExistError", "账号不能为空"),
	PlayerBoUsernameFormatError("PlayerBoUsernameExistError", "账号格式不正确"),
	DictGroupNotExistError("DictGroupNotExistError", "字典分组信息不存在"),
	DictGroupIdNotNullError("DictGroupIdNotNullError", "字典分组ID不能为空"),
	DictGroupNameExistError("DictGroupNameExistError", "字典分组名称已存在"),
	DictGroupNameNotNullError("RoleNameNotNullError", "字典分组名称不能为空"),
	DictGroupNameLength10Error("RoleNameLength6Error", "字典分组名称最多10位"),
	DictGroupExistLevelError("DictGroupExistLevelError", "字典分组下存在字典信息"),
	DictNotExistError("DictNotExistError", "字典信息不存在"),
	DictAgentNotExistError("DictAgentNotExistError", "代理字典信息不存在"),
	DictAgentCompanyIdNotExistError("DictAgentCompanyIdNotExistError", "代理ID不存在"),
	AmountGTZeroError("AmountGTZeroError", "金额有误"),
    ComapanyIdNotNullError("ComapanyIdNotNullError","代理商ID不能为空"),
    PlayerSubLimitMoreThanTotal("PlayerSubLimitMoreThanTotalError", "可使用/可消耗的额度不能超过总号额度"),
    PlayerSubLimitNotEnough("PlayerSubLimitNotEnoughError", "子账号额度不足"),
    PlayerSubLimitSingleMoreLimit("PlayerSubLimitSingleMoreLimitError", "单笔限额不能超过设置额度"),
    PlayerSubLimitLessSingle("PlayerSubLimitLessSingleError", "当前金额超过子账号设置的单笔限额"),
	BankMerchantSummarySizeError("BankMerchantSummarySizeError", "查询天数不合法"),
	;

	private final String code;
	private final String message;
	private final HttpStatus status;

	ErrorType(String code, String message, HttpStatus status) {
		this.code = code;
		this.message = message;
		this.status = status;
	}

	ErrorType(String code, String message) {
		this(code, message, HttpStatus.BAD_REQUEST);
	}
}
