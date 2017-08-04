package jp.co.aliber.accsystem.mapper.auto;

import java.util.List;
import jp.co.aliber.accsystem.entity.auto.Company;
import jp.co.aliber.accsystem.entity.auto.CompanyExample;
import org.apache.ibatis.annotations.Param;

public interface CompanyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.company
     *
     * @mbg.generated
     */
    long countByExample(CompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.company
     *
     * @mbg.generated
     */
    int deleteByExample(CompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.company
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long compId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.company
     *
     * @mbg.generated
     */
    int insert(Company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.company
     *
     * @mbg.generated
     */
    int insertSelective(Company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.company
     *
     * @mbg.generated
     */
    List<Company> selectByExample(CompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.company
     *
     * @mbg.generated
     */
    Company selectByPrimaryKey(Long compId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.company
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.company
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.company
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.company
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Company record);
}