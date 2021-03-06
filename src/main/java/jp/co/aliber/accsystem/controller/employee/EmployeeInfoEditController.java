package jp.co.aliber.accsystem.controller.employee;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.aliber.accsystem.entity.auto.TCompanyDepartment;
import jp.co.aliber.accsystem.entity.auto.TEmployee;
import jp.co.aliber.accsystem.entity.auto.TEmployeeBankAccount;
import jp.co.aliber.accsystem.entity.auto.TEmployeeFixedDeduction;
import jp.co.aliber.accsystem.entity.auto.TEmployeeFixedPayment;
import jp.co.aliber.accsystem.entity.auto.TEmployeeIncomeTax;
import jp.co.aliber.accsystem.entity.auto.TEmployeeSocialInsurance;
import jp.co.aliber.accsystem.form.employee.EmployeeInfoEditForm;
import jp.co.aliber.accsystem.security.LoginUser;
import jp.co.aliber.accsystem.service.UtilService;
import jp.co.aliber.accsystem.service.company.CompanyDepartmentService;
import jp.co.aliber.accsystem.service.employee.EmployeeBankAccountService;
import jp.co.aliber.accsystem.service.employee.EmployeeFixedDeductionService;
import jp.co.aliber.accsystem.service.employee.EmployeeFixedPaymentService;
import jp.co.aliber.accsystem.service.employee.EmployeeIncomeTaxService;
import jp.co.aliber.accsystem.service.employee.EmployeeService;
import jp.co.aliber.accsystem.service.employee.EmployeeSocialInsuranceService;

/**
 * 従業員データ入力画面
 *
 * @author son_k
 *
 */
@Controller
@RequestMapping("/employee_info_edit")
public class EmployeeInfoEditController {

	/**
	 * 從業員情報サービス
	 */
	@Autowired
	private EmployeeService tEmployeeService;

	/**
	 * 從業員口座情報サービス
	 */
	@Autowired
	private EmployeeBankAccountService tEmployeeBankAccountService;

	/**
	 * 固定控除金額情報サービス
	 */
	@Autowired
	private EmployeeFixedDeductionService tEmployeeFixedDeductionService;

	/**
	 * 固定支給金額情報サービス
	 */
	@Autowired
	private EmployeeFixedPaymentService tEmployeeFixedPaymentService;

	/**
	 * 所得税情報サービス
	 */
	@Autowired
	private EmployeeIncomeTaxService tEmployeeIncomeTaxService;

	/**
	 * 社会保険サービス
	 */
	@Autowired
	private EmployeeSocialInsuranceService tEmployeeSocialInsuranceService;

	/**
	 * 会社部署情報サービス
	 */
	@Autowired
	private CompanyDepartmentService tCompanyDepartmentService;

	/**
	 * utilサービス
	 */
	@Autowired
	private UtilService utilService;

	/**
	 * データのバンディング
	 *
	 * @param binder
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}

	/**
	 * 従業員データ入力画面
	 *
	 * @param form
	 *            従業員データ入力画面Form
	 * @param emplyeeId
	 *            従業員ID
	 * @return 従業員データ入力画面
	 */
	@RequestMapping(value = { "/", "" }, method = RequestMethod.GET)
	public String index(EmployeeInfoEditForm form,
			@RequestParam(value = "emplyeeId", required = false) String emplyeeId,
			@AuthenticationPrincipal LoginUser loginUser) {
		// 部署リスト
		List<TCompanyDepartment> listTCompanyDepartment = tCompanyDepartmentService
				.getListTCompanyDepartment(loginUser.getUser().getCompId());
		form.setDepartmentList(listTCompanyDepartment);

		if (emplyeeId == null) {
			// 登録の場合
			form.setCreationflag(false);
			return "employee/employee_info_edit";
		}
		// 更新の場合
		form.setCreationflag(true);
		Integer emplyeeIdEdit = Integer.valueOf(emplyeeId);
		// 從業員番号
		form.setEmployeeId(emplyeeIdEdit);

		// 從業員情報
		TEmployee employee = tEmployeeService.getTEmployee(emplyeeIdEdit, loginUser.getUser().getCompId());
		if (employee != null) {
			if (employee.getEmployeeNo() != null) {
				form.setEmployeeNo(employee.getEmployeeNo());
			}
			if (StringUtils.isNotEmpty(employee.getFirstName())) {
				form.setFirstName(employee.getFirstName());
			}
			if (StringUtils.isNotEmpty(employee.getLastName())) {
				form.setLastName(employee.getLastName());
			}
			if (employee.getDeptId() != null) {
				form.setDepartment(employee.getDeptId());
			}
			if (StringUtils.isNotEmpty(employee.getLastNameKana())) {
				form.setLastNameKana(employee.getLastNameKana());
			}
			if (StringUtils.isNotEmpty(employee.getFirstNameKana())) {
				form.setFirstNameKana(employee.getFirstNameKana());
			}
			if (employee.getSex() != null) {
				form.setSex(employee.getSex() ? 0 : 1);
			}
			if (StringUtils.isNotEmpty(employee.getMailAddress())) {
				form.setEmail(employee.getMailAddress());
			}
		}

		// 口座情報
		TEmployeeBankAccount tEmployeeBankAccount = tEmployeeBankAccountService.getTEmployeeBankAccount(emplyeeIdEdit,
				loginUser.getUser().getCompId());
		if (tEmployeeBankAccount != null) {
			if (StringUtils.isNotEmpty(tEmployeeBankAccount.getAccountKana())) {
				form.setAccountHolder(tEmployeeBankAccount.getAccountKana());
			}
			if (tEmployeeBankAccount.getBankCode() != null) {
				form.setBankCode(tEmployeeBankAccount.getBankCode());
			}
			if (tEmployeeBankAccount.getBankName() != null) {
				form.setBankName(tEmployeeBankAccount.getBankName());
			}
			if (tEmployeeBankAccount.getAccountCategory() != null) {
				form.setAccountType(Integer.valueOf(tEmployeeBankAccount.getAccountCategory()).intValue());

			}
			if (tEmployeeBankAccount.getBranchCode() != null) {
				form.setBranchCode(tEmployeeBankAccount.getBranchCode());
			}
			if (tEmployeeBankAccount.getBranchName() != null) {
				form.setBranchName(tEmployeeBankAccount.getBranchName());
			}
			if (tEmployeeBankAccount.getAccountNo() != null) {
				form.setAccountNumber(tEmployeeBankAccount.getAccountNo());
			}
		}
		// 固定控除金額情報
		TEmployeeFixedDeduction tEmployeeFixedDeduction = tEmployeeFixedDeductionService
				.getTEmployeeFixedDeduction(emplyeeIdEdit, loginUser.getUser().getCompId());
		if (tEmployeeFixedDeduction != null) {
			if (tEmployeeFixedDeduction.getTravelFund() != null) {
				form.setTravelFund(tEmployeeFixedDeduction.getTravelFund());
			}
			if (tEmployeeFixedDeduction.getRepaymentBorrowings() != null) {
				form.setRepaymentBorrowings(tEmployeeFixedDeduction.getRepaymentBorrowings());
			}
			if (tEmployeeFixedDeduction.getOtherDeduction() != null) {
				form.setOtherDeductions(tEmployeeFixedDeduction.getOtherDeduction());
			}
		}
		// 固定支給金額情報
		TEmployeeFixedPayment tEmployeeFixedPayment = tEmployeeFixedPaymentService
				.getTEmployeeFixedPayment(emplyeeIdEdit, loginUser.getUser().getCompId());
		if (tEmployeeFixedPayment != null) {
			if (tEmployeeFixedPayment.getBasicSalary() != null) {
				form.setBasicSalary(tEmployeeFixedPayment.getBasicSalary());
			}
			if (tEmployeeFixedPayment.getPositionAllowance() != null) {
				form.setJobAllowance(tEmployeeFixedPayment.getPositionAllowance());
			}
			if (tEmployeeFixedPayment.getQualificationAllowance() != null) {
				form.setRequirementsAllowance(tEmployeeFixedPayment.getQualificationAllowance());
			}
			if (tEmployeeFixedPayment.getHouseAllowance() != null) {
				form.setHousingAllowance(tEmployeeFixedPayment.getHouseAllowance());
			}
			if (tEmployeeFixedPayment.getFamilyAllowance() != null) {
				form.setFamilyAllowance(tEmployeeFixedPayment.getFamilyAllowance());
			}
			if (tEmployeeFixedPayment.getOtherAllowance() != null) {
				form.setOtherAllowance(tEmployeeFixedPayment.getOtherAllowance());
			}
			if (tEmployeeFixedPayment.getTransportFee() != null) {
				form.setTaxExpense(tEmployeeFixedPayment.getTransportFee());
			}
		}
		// 所得税情報
		TEmployeeIncomeTax tEmployeeIncomeTax = tEmployeeIncomeTaxService.getTEmployeeIncomeTax(emplyeeIdEdit,
				loginUser.getUser().getCompId());
		if (tEmployeeIncomeTax != null) {
			if (tEmployeeIncomeTax.getHeadHouseholdName() != null) {
				form.setHouseholdName(tEmployeeIncomeTax.getHeadHouseholdName());
			}
			if (tEmployeeIncomeTax.getDependencyCount() != null) {
				form.setDependentsNumber(tEmployeeIncomeTax.getDependencyCount());
			}
			if (tEmployeeIncomeTax.getIncomeTaxType() != null) {
				form.setIncomeTaxDistinction(tEmployeeIncomeTax.getIncomeTaxType());
			}
			if (tEmployeeIncomeTax.getDeductibleSpouse() != null) {
				form.setConsort(tEmployeeIncomeTax.getDeductibleSpouse() ? 1 : 0);
			}
			if (tEmployeeIncomeTax.getDependencyDeductionDeclaration() != null) {
				form.setDependents(tEmployeeIncomeTax.getDependencyDeductionDeclaration() ? 1 : 0);
			}
			if (tEmployeeIncomeTax.getRelationship() != null) {
				form.setRelationship(tEmployeeIncomeTax.getRelationship());
			}
			if (tEmployeeIncomeTax.getTreatyException() != null) {
				form.setTreatyExemption(tEmployeeIncomeTax.getTreatyException());
			}
			if (tEmployeeIncomeTax.getBlueOfficer() != null) {
				form.setBlueOfficer(tEmployeeIncomeTax.getBlueOfficer());
			}
		}
		// 社会保険
		TEmployeeSocialInsurance tEmployeeSocialInsurance = tEmployeeSocialInsuranceService
				.getTEmployeeIncomeTax(emplyeeIdEdit, loginUser.getUser().getCompId());
		if (tEmployeeSocialInsurance != null) {
			// 雇用保険加入フラグ
			if (tEmployeeSocialInsurance.getEmployInsurJoinFlg() != null) {
				form.setInsuranceFlag(tEmployeeSocialInsurance.getEmployInsurJoinFlg());
			}
			// 健康保険加入フラグ
			if (tEmployeeSocialInsurance.getHealthInsurJoinFlg() != null) {
				form.setHealthInsuranceFlag(tEmployeeSocialInsurance.getHealthInsurJoinFlg());
			}
			// 健康保険種別
			if (tEmployeeSocialInsurance.getHealthInsurJoinCatagory() != null) {
				form.setHealthInsuranceType(tEmployeeSocialInsurance.getHealthInsurJoinCatagory());
			}
			// 健康保険標準報酬レベル
			if (tEmployeeSocialInsurance.getHealthInsurStandardRewardLevel() != null) {
				form.setHealthCompensation(tEmployeeSocialInsurance.getHealthInsurStandardRewardLevel());
			}
			// 保険者番号
			if (tEmployeeSocialInsurance.getInsurersNo() != null) {
				form.setInsurerNumber(tEmployeeSocialInsurance.getInsurersNo());
			}
			// 被保険者整理番号
			if (tEmployeeSocialInsurance.getInsuredSortNo() != null) {
				form.setInsuredPersonnelNumber(tEmployeeSocialInsurance.getInsuredSortNo());
			}
			// 厚生年金加入フラグ
			if (tEmployeeSocialInsurance.getWelfareJoinFlg() != null) {
				form.setWelfarePensionFlag(tEmployeeSocialInsurance.getWelfareJoinFlg() ? 0 : 1);
			}
			// 厚生年金標準報酬レベル
			if (tEmployeeSocialInsurance.getWelfareStandardRewardLevel() != null) {
				form.setWelfareCompensation(tEmployeeSocialInsurance.getWelfareStandardRewardLevel());
			}
			// 基礎年金番号
			if (tEmployeeSocialInsurance.getBasicWelfareNo() != null) {
				form.setWelfareNumber(tEmployeeSocialInsurance.getBasicWelfareNo());
			}
			// 厚生年金基金加入フラグ
			if (tEmployeeSocialInsurance.getWelfareFundJoinFlg() != null) {
				form.setWelfareFund(tEmployeeSocialInsurance.getWelfareFundJoinFlg() ? 0 : 1);
			}
		}

		return "employee/employee_info_edit";
	}

	/**
	 * 保存処理
	 *
	 * @param form
	 *            従業員データ入力画面Form
	 * @return 従業員データ入力画面
	 */
	@RequestMapping(value = { "/save" }, method = RequestMethod.POST)
	public String save(@Validated EmployeeInfoEditForm form, BindingResult result,
			@AuthenticationPrincipal LoginUser loginUser) {
		// 入力チェック
		if (!validate(form, result)) {
			return "employee/employee_info_edit";
		}

		// システム日付を取得する
		Date date = new Date();

		// 從業員情報
		TEmployee tEmployee = new TEmployee();
		// 従業員番号
		tEmployee.setEmployeeNo(form.getEmployeeNo());
		// 会社番号
		tEmployee.setCompId(loginUser.getUser().getCompId());
		// 部署id
		tEmployee.setDeptId(form.getDepartment());
		// 姓
		tEmployee.setLastName(form.getLastName());
		// 名
		tEmployee.setFirstName(form.getFirstName());
		// フリガナ姓
		if (StringUtils.isNotEmpty(form.getLastNameKana())) {
			tEmployee.setLastNameKana(form.getLastNameKana());
		}
		// フリガナ名
		if (StringUtils.isNotEmpty(form.getFirstNameKana())) {
			tEmployee.setFirstNameKana(form.getFirstNameKana());
		}
		// 性別
		if (form.getSex() != null) {
			tEmployee.setSex(form.getSex() == 0 ? true : false);
		}
		// メルアドレース
		if (StringUtils.isNotEmpty(form.getEmail())) {
			tEmployee.setMailAddress(form.getEmail());
		}

		tEmployee.setUpdateId(loginUser.getUser().getUserId());

		tEmployee.setUpdateDate(date);

		// 口座情報
		TEmployeeBankAccount tEmployeeBankAccount = new TEmployeeBankAccount();
		// 会社番号
		tEmployeeBankAccount.setCompId(loginUser.getUser().getCompId());
		// 口座番号
		tEmployeeBankAccount.setAccountNo(form.getAccountNumber() != null ? form.getAccountNumber().toString() : null);
		// 口座名義人(ｶﾅ)
		tEmployeeBankAccount.setAccountKana(form.getAccountHolder());
		// 銀行コード
		tEmployeeBankAccount.setBankCode(form.getBankCode());
		// 銀行名
		tEmployeeBankAccount.setBankName(form.getBankName());
		// 口座種別
		tEmployeeBankAccount
				.setAccountCategory(form.getAccountType() != null ? String.valueOf(form.getAccountType()) : null);
		// 本支店コード
		tEmployeeBankAccount.setBranchCode(form.getBranchCode() != null ? form.getBranchCode().toString() : null);
		// 本支店名
		tEmployeeBankAccount.setBranchName(StringUtils.isNotEmpty(form.getBranchName()) ? form.getBranchName() : null);
		// 更新者id
		tEmployeeBankAccount.setUpdateId(loginUser.getUser().getUserId());
		// 更新日
		tEmployeeBankAccount.setUpdateDate(date);
		// 固定控除金額情報
		TEmployeeFixedDeduction tEmployeeFixedDeduction = new TEmployeeFixedDeduction();
		tEmployeeFixedDeduction.setCompId(loginUser.getUser().getCompId());
		// 旅行積立金
		tEmployeeFixedDeduction.setTravelFund(form.getTravelFund() != null ? form.getTravelFund() : null);
		// 借入等返済
		tEmployeeFixedDeduction
				.setRepaymentBorrowings(form.getRepaymentBorrowings() != null ? form.getRepaymentBorrowings() : null);
		// その他控除
		tEmployeeFixedDeduction.setOtherDeduction(form.getOtherDeductions() != null ? form.getOtherDeductions() : null);
		tEmployeeFixedDeduction.setUpdateId(loginUser.getUser().getUserId());
		tEmployeeFixedDeduction.setUpdateDate(date);
		// 固定支給金額情報
		TEmployeeFixedPayment tEmployeeFixedPayment = new TEmployeeFixedPayment();
		tEmployeeFixedPayment.setCompId(loginUser.getUser().getCompId());
		// 基本給
		tEmployeeFixedPayment.setBasicSalary(form.getBasicSalary());
		// 役職手当
		tEmployeeFixedPayment.setPositionAllowance(form.getJobAllowance() != null ? form.getJobAllowance() : null);
		// 資格手当
		tEmployeeFixedPayment.setQualificationAllowance(
				form.getRequirementsAllowance() != null ? form.getRequirementsAllowance() : null);
		// 住宅手当
		tEmployeeFixedPayment.setHouseAllowance(form.getHousingAllowance() != null ? form.getHousingAllowance() : null);
		// 家族手当
		tEmployeeFixedPayment.setFamilyAllowance(form.getFamilyAllowance() != null ? form.getFamilyAllowance() : null);
		// その他手当
		tEmployeeFixedPayment.setOtherAllowance(form.getOtherAllowance() != null ? form.getOtherAllowance() : null);
		// 交通費(実費)
		tEmployeeFixedPayment.setTransportFee(form.getTaxExpense() != null ? form.getTaxExpense() : null);
		tEmployeeFixedPayment.setUpdateId(loginUser.getUser().getUserId());
		tEmployeeFixedPayment.setUpdateDate(date);
		// 所得税情報
		TEmployeeIncomeTax tEmployeeIncomeTax = new TEmployeeIncomeTax();

		tEmployeeIncomeTax.setCompId(loginUser.getUser().getCompId());
		// 所得税区分
		tEmployeeIncomeTax.setIncomeTaxType(form.getIncomeTaxDistinction());
		// 控除対象配偶者
		tEmployeeIncomeTax.setDeductibleSpouse(form.getConsort() == 0 ? false : true);
		// 扶養控除等の申告
		tEmployeeIncomeTax.setDependencyDeductionDeclaration(form.getDependents() == 0 ? false : true);
		// 扶養人数
		tEmployeeIncomeTax.setDependencyCount(form.getDependentsNumber());
		// 世帯主名
		tEmployeeIncomeTax.setHeadHouseholdName(form.getHouseholdName());
		// 続柄
		tEmployeeIncomeTax.setRelationship(
				StringUtils.isNotEmpty(form.getRelationship()) ? String.valueOf(form.getRelationship()) : null);
		// 条約免除
		tEmployeeIncomeTax.setTreatyException(form.getTreatyExemption() != null ? form.getTreatyExemption() : false);
		// 青色専従者
		tEmployeeIncomeTax.setBlueOfficer(form.getBlueOfficer() != null ? form.getBlueOfficer() : false);

		tEmployeeIncomeTax.setUpdateId(loginUser.getUser().getUserId());
		tEmployeeIncomeTax.setUpdateDate(date);

		// 社会保険
		TEmployeeSocialInsurance tEmployeeSocialInsurance = new TEmployeeSocialInsurance();
		tEmployeeSocialInsurance.setCompId(loginUser.getUser().getCompId());
		// 雇用保険
		tEmployeeSocialInsurance.setEmployInsurJoinFlg(form.getInsuranceFlag());
		// 健康保険
		tEmployeeSocialInsurance.setHealthInsurJoinFlg(form.getHealthInsuranceFlag());
		// 健康保険種別
		tEmployeeSocialInsurance.setHealthInsurJoinCatagory(
				form.getHealthInsuranceType() != null ? form.getHealthInsuranceType() : null);
		// 健康保険の標準報酬
		tEmployeeSocialInsurance.setHealthInsurStandardRewardLevel(
				form.getHealthCompensation() != null ? form.getHealthCompensation() : null);
		// 保険者番号
		tEmployeeSocialInsurance.setInsurersNo(form.getInsurerNumber() != null ? form.getInsurerNumber() : null);
		// 被保険者整理番号
		tEmployeeSocialInsurance
				.setInsuredSortNo(form.getInsuredPersonnelNumber() != null ? form.getInsuredPersonnelNumber() : null);
		// 厚生年金
		tEmployeeSocialInsurance.setWelfareJoinFlg(form.getWelfarePensionFlag() == 0 ? true : false);
		// 厚生年金の標準報酬
		tEmployeeSocialInsurance.setWelfareStandardRewardLevel(
				form.getWelfareCompensation() != null ? form.getWelfareCompensation() : null);
		// 基礎年金番号
		tEmployeeSocialInsurance.setBasicWelfareNo(form.getWelfareNumber() != null ? form.getWelfareNumber() : null);
		// 厚生年金基金
		tEmployeeSocialInsurance.setWelfareFundJoinFlg(form.getWelfareFund() == 0 ? true : false);
		tEmployeeSocialInsurance.setUpdateId(loginUser.getUser().getUserId());

		if (form.isCreationflag()) {
			// 更新の場合
			// 從業員情報
			tEmployee.setEmployeeId(form.getEmployeeId());
			tEmployeeService.update(tEmployee);
			// 口座情報
			tEmployeeBankAccount.setEmployeeId(form.getEmployeeId());
			tEmployeeBankAccountService.update(tEmployeeBankAccount);
			// 固定控除金額情報
			tEmployeeFixedDeduction.setEmployeeId(form.getEmployeeId());
			tEmployeeFixedDeductionService.update(tEmployeeFixedDeduction);
			// 固定支給金額情報
			tEmployeeFixedPayment.setEmployeeId(form.getEmployeeId());
			tEmployeeFixedPaymentService.update(tEmployeeFixedPayment);
			// 所得税情報
			tEmployeeIncomeTax.setEmployeeId(form.getEmployeeId());
			tEmployeeIncomeTaxService.update(tEmployeeIncomeTax);
			// 社会保険情報
			tEmployeeSocialInsurance.setEmployeeId(form.getEmployeeId());
			tEmployeeSocialInsuranceService.update(tEmployeeSocialInsurance);

			return "redirect:/employee_info";
		}

		// 新規の場合
		// 從業員情報
		tEmployee.setRegistId(loginUser.getUser().getUserId());
		tEmployee.setRegistDate(date);
		tEmployeeService.regist(tEmployee);

		// シーケンスを取得
		Integer employeeId = utilService.getSeqLastValue();

		// 口座情報
		tEmployeeBankAccount.setEmployeeId(employeeId.intValue());
		tEmployeeBankAccount.setRegistId(loginUser.getUser().getUserId());
		tEmployeeBankAccount.setRegistDate(date);
		tEmployeeBankAccountService.regist(tEmployeeBankAccount);

		// 固定控除金額情報
		tEmployeeFixedDeduction.setEmployeeId(employeeId.intValue());
		tEmployeeFixedDeduction.setRegistId(loginUser.getUser().getUserId());
		tEmployeeFixedDeduction.setRegistDate(date);
		tEmployeeFixedDeductionService.regist(tEmployeeFixedDeduction);

		// 固定支給金額情報
		tEmployeeFixedPayment.setEmployeeId(employeeId.intValue());
		tEmployeeFixedPayment.setRegistId(loginUser.getUser().getUserId());
		tEmployeeFixedPayment.setRegistDate(date);
		tEmployeeFixedPaymentService.regist(tEmployeeFixedPayment);

		// 所得税情報
		tEmployeeIncomeTax.setEmployeeId(employeeId.intValue());
		tEmployeeIncomeTax.setRegistId(loginUser.getUser().getUserId());
		tEmployeeIncomeTax.setRegistDate(date);
		tEmployeeIncomeTaxService.regist(tEmployeeIncomeTax);

		// 社会保険
		tEmployeeSocialInsurance.setEmployeeId(employeeId.intValue());
		tEmployeeSocialInsurance.setRegistId(loginUser.getUser().getUserId());
		tEmployeeSocialInsurance.setRegistDate(date);
		tEmployeeSocialInsuranceService.regist(tEmployeeSocialInsurance);

		return "redirect:/employee_info";
	}

	/**
	 * 入力チェック
	 *
	 * @param locale<br>
	 *            ロケール
	 * @param model<br>
	 *            モデル
	 * @param LoginuserinfoeditForm<br>
	 *            ログイン者情報編集Form
	 * @param BindingResult<br>
	 *            Resultバンディング
	 * @return validateResult<br>
	 *         入力チェック結果
	 */
	private boolean validate(EmployeeInfoEditForm form, BindingResult result) {

		boolean validateResult = true;

		// 入力チェック
		if (result.hasErrors()) {
			validateResult = false;
		}

		// 入力チェック結果
		return validateResult;
	}

}
