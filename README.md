# ScreenDemo
屏幕适配

    px适配 
        java -jar %~dp0\screenMatchPX.jar 720 1280 1080,1776;(宽 高 宽,高;)
        pause
        生成文件 values-480x320  height*width values-高x宽
        
    dp适配
        生成文件values-sw384dp 
        如果需要的dp值没有 在values下dimens.xml中添加  然后在screenMatchPX.bat路径再次执行bat文件