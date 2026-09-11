execute as @a run execute unless score @s metalpipe_cooldown matches 0 run scoreboard players remove @s metalpipe_cooldown 1
execute as @a run execute if score @s metalpipe_cooldown matches 0 run advancement revoke @s only metal-pipes:metal_pipe
