@echo off
setlocal enabledelayedexpansion

set "pidFile=shutdown.pid"

REM Vérifier si le fichier pid existe
if not exist %pidFile% (
    echo Le fichier %pidFile% n'existe pas.
    exit /b 1
)

REM Lire la valeur numérique du fichier pid
set /p pid=<%pidFile%

REM Tuer le processus correspondant
taskkill /F /PID %pid%

REM Vérifier si la commande taskkill a réussi
if errorlevel 1 (
    echo Impossible to stop Hermes application^(pid=!pid!^)
    exit /b 1
) else (
    echo Hermes has been stopped^(pid=!pid!^)
)

exit /b 0