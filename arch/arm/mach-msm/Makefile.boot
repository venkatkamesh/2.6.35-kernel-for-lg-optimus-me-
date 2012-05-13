# MSM7x01A
   zreladdr-$(CONFIG_ARCH_MSM7X01A)	:= 0x10008000
params_phys-$(CONFIG_ARCH_MSM7X01A)	:= 0x10000100
initrd_phys-$(CONFIG_ARCH_MSM7X01A)	:= 0x10800000

# MSM7x25
   zreladdr-$(CONFIG_ARCH_MSM7X25)	:= 0x00208000
params_phys-$(CONFIG_ARCH_MSM7X25)	:= 0x00200100
initrd_phys-$(CONFIG_ARCH_MSM7X25)	:= 0x0A000000

# MSM7x27
ifeq ($(CONFIG_LGE_4G_DDR),y)
	   zreladdr-$(CONFIG_MACH_MSM7X27_THUNDERG)	:= 0x12808000
	params_phys-$(CONFIG_MACH_MSM7X27_THUNDERG)	:= 0x12800100
	initrd_phys-$(CONFIG_MACH_MSM7X27_THUNDERG)	:= 0x13800000
	   
	   zreladdr-$(CONFIG_MACH_MSM7X27_GELATO)   := 0x12808000
	params_phys-$(CONFIG_MACH_MSM7X27_GELATO)   := 0x12800100
	initrd_phys-$(CONFIG_MACH_MSM7X27_GELATO)   := 0x13800000

	   zreladdr-$(CONFIG_MACH_MSM7X27_UNIVA)   := 0x12808000
	params_phys-$(CONFIG_MACH_MSM7X27_UNIVA)   := 0x12800100
	initrd_phys-$(CONFIG_MACH_MSM7X27_UNIVA)   := 0x13800000

	   zreladdr-$(CONFIG_MACH_MSM7X27_PECAN)	:= 0x02808000
	params_phys-$(CONFIG_MACH_MSM7X27_PECAN)	:= 0x02800100
	initrd_phys-$(CONFIG_MACH_MSM7X27_PECAN)	:= 0x03800000	
else
	   zreladdr-$(CONFIG_ARCH_MSM7X27)	:= 0x00208000
	params_phys-$(CONFIG_ARCH_MSM7X27)	:= 0x00200100
	initrd_phys-$(CONFIG_ARCH_MSM7X27)	:= 0x0A000000

	   zreladdr-$(CONFIG_MACH_MSM7X27_PECAN)	:= 0x02808000
	params_phys-$(CONFIG_MACH_MSM7X27_PECAN)	:= 0x02800100
	initrd_phys-$(CONFIG_MACH_MSM7X27_PECAN)	:= 0x03800000

	   zreladdr-$(CONFIG_MACH_MSM7X27_MUSCAT)   := 0x02808000
	params_phys-$(CONFIG_MACH_MSM7X27_MUSCAT)   := 0x02800100
	initrd_phys-$(CONFIG_MACH_MSM7X27_MUSCAT)   := 0x03800000

	   zreladdr-$(CONFIG_MACH_MSM7X27_JUMP)   := 0x02808000
	params_phys-$(CONFIG_MACH_MSM7X27_JUMP)   := 0x02800100
	initrd_phys-$(CONFIG_MACH_MSM7X27_JUMP)   := 0x03800000
endif

# MSM7x30
   zreladdr-$(CONFIG_ARCH_MSM7X30)	:= 0x00208000
params_phys-$(CONFIG_ARCH_MSM7X30)	:= 0x00200100
initrd_phys-$(CONFIG_ARCH_MSM7X30)	:= 0x01200000

ifeq ($(CONFIG_MSM_SOC_REV_A),y)
# QSD8X50A
   zreladdr-$(CONFIG_ARCH_QSD8X50)	:= 0x00008000
params_phys-$(CONFIG_ARCH_QSD8X50)	:= 0x00000100
initrd_phys-$(CONFIG_ARCH_QSD8X50)	:= 0x04000000
else
# QSD8x50
   zreladdr-$(CONFIG_ARCH_QSD8X50)	:= 0x20008000
params_phys-$(CONFIG_ARCH_QSD8X50)	:= 0x20000100
initrd_phys-$(CONFIG_ARCH_QSD8X50)	:= 0x24000000
endif

# MSM8x60
   zreladdr-$(CONFIG_ARCH_MSM8X60)	:= 0x40208000
