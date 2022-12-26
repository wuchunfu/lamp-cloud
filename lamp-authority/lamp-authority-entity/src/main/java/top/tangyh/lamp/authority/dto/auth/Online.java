package top.tangyh.lamp.authority.dto.auth;

import cn.afterturn.easypoi.excel.annotation.Excel;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import jakarta.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;

import static top.tangyh.basic.utils.DateUtils.DEFAULT_DATE_TIME_FORMAT;

/**
 * <p>
 * 实体类
 * 在线用户
 * </p>
 *
 * @author zuihou
 * @since 2020-11-20
 */
@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode
@Accessors(chain = true)
@Schema(description="在线用户")
@AllArgsConstructor
@Builder
public class Online implements Serializable {

    private static final long serialVersionUID = 1L;
    @Schema(description="用户id")
    private Long userId;

    /**
     * 登录IP
     */
    @Schema(description="登录IP")
    @Size(max = 50, message = "登录IP长度不能超过50")
    @Excel(name = "登录IP")
    private String loginIp;

    /**
     * 登录地点
     */
    @Schema(description="登录地点")
    @Size(max = 50, message = "登录地点长度不能超过50")
    @Excel(name = "登录地点")
    private String location;

    /**
     * 客户端Key
     */
    @Schema(description="客户端Key")
    @Size(max = 24, message = "客户端Key长度不能超过24")
    @Excel(name = "客户端Key")
    private String clientId;

    /**
     * token
     */
    @Schema(description="token")
    @Size(max = 65535, message = "token长度不能超过65535")
    @Excel(name = "token")
    private String token;

    /**
     * 姓名
     */
    @Schema(description="姓名")
    @Size(max = 50, message = "姓名长度不能超过50")
    @Excel(name = "姓名")
    private String name;

    /**
     * 过期时间
     */
    @Schema(description="过期时间")
    @Excel(name = "过期时间", format = DEFAULT_DATE_TIME_FORMAT, width = 20)
    private LocalDateTime expireTime;

    @Schema(description="登录时间")
    @Excel(name = "登录时间", format = DEFAULT_DATE_TIME_FORMAT, width = 20)
    private LocalDateTime loginTime;

    /**
     * 账号
     */
    @Schema(description="账号")
    @Size(max = 30, message = "账号长度不能超过30")
    @Excel(name = "账号")
    private String account;

    @Schema(description="有效期")
    private Long expireMillis;


}
