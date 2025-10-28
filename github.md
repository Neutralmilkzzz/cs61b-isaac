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

接下来简单写一下github上**上传，下载，更改项目**的全流程

![image-20251025185120643](C:\Users\ZHAOKAI\AppData\Roaming\Typora\typora-user-images\image-20251025185120643.png)

## 1 下载

如你所见，我有一个账号，上面有很多东西。以**CS61A**为例，我给你示范一下**如何下载**。

![image-20251025185515445](C:\Users\ZHAOKAI\AppData\Roaming\Typora\typora-user-images\image-20251025185515445.png)

我们发现这个项目的网址，于是在linux的命令行中输入

`git clone https://github.com/Neutralmilkzzz/CS61A-2025-Fall`

我就把他克隆了下来。

## 2 修改

`touch change.py`之后，我成功地做到了在原文件夹捏造了一个python文件。

## 3 同步更新

`git pull --rebase origin main`

## 4 上传新文件

`git add sth`

## 5 提交说明

`git commit -m "upload IntList.java"`

## 6 认证身份

`ssh -T git@github.com`

## 7 设置远程仓库为ssh模式

`git remote set-url origin git@github.com:Neutralmilkzzz/XXXXXXXXX.git`

## 8 推送

`git push origin main`

![image-20251025191652750](C:\Users\ZHAOKAI\AppData\Roaming\Typora\typora-user-images\image-20251025191652750.png)

![df022e710727cdb5da049285d0870a9](C:\Users\ZHAOKAI\Documents\WeChat Files\wxid_tcjezcak4wsr12\FileStorage\Temp\df022e710727cdb5da049285d0870a9.png)

一人一句isaac牛逼来![16ce08c7344918e773856cff5ccd454](C:\Users\ZHAOKAI\Documents\WeChat Files\wxid_tcjezcak4wsr12\FileStorage\Temp\16ce08c7344918e773856cff5ccd454.png)