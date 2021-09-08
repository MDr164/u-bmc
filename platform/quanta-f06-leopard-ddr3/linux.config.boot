CONFIG_LOCALVERSION="-ubmc-boot"
CONFIG_KERNEL_XZ=y
CONFIG_DEFAULT_HOSTNAME="bootldr"
CONFIG_SYSVIPC=y
CONFIG_NO_HZ_IDLE=y
CONFIG_HIGH_RES_TIMERS=y
CONFIG_IKCONFIG=y
CONFIG_IKCONFIG_PROC=y
CONFIG_LOG_BUF_SHIFT=16
CONFIG_BLK_DEV_INITRD=y
# CONFIG_RD_BZIP2 is not set
# CONFIG_RD_LZMA is not set
# CONFIG_RD_LZO is not set
# CONFIG_RD_LZ4 is not set
# CONFIG_RD_ZSTD is not set
CONFIG_CC_OPTIMIZE_FOR_SIZE=y
# CONFIG_UID16 is not set
# CONFIG_SYSFS_SYSCALL is not set
# CONFIG_AIO is not set
# CONFIG_RSEQ is not set
CONFIG_EMBEDDED=y
CONFIG_PERF_EVENTS=y
# CONFIG_COMPAT_BRK is not set
CONFIG_SLOB=y
# CONFIG_SLAB_MERGE_DEFAULT is not set
CONFIG_SHUFFLE_PAGE_ALLOCATOR=y
# CONFIG_ARCH_MULTI_V7 is not set
CONFIG_ARCH_ASPEED=y
CONFIG_MACH_ASPEED_G4=y
CONFIG_VMSPLIT_2G=y
CONFIG_AEABI=y
CONFIG_UACCESS_WITH_MEMCPY=y
# CONFIG_ATAGS is not set
CONFIG_CMDLINE="earlyprintk=1 rdinit=/loader ubi.mtd=ubi console=ttyS4,57600n8"
CONFIG_KEXEC=y
# CONFIG_SUSPEND is not set
CONFIG_FIRMWARE_MEMMAP=y
CONFIG_JUMP_LABEL=y
CONFIG_STRICT_KERNEL_RWX=y
CONFIG_STRICT_MODULE_RWX=y
CONFIG_MODULES=y
CONFIG_MODULE_SIG=y
CONFIG_MODULE_SIG_FORCE=y
CONFIG_MODULE_SIG_SHA256=y
# CONFIG_BLOCK is not set
# CONFIG_BINFMT_SCRIPT is not set
# CONFIG_COREDUMP is not set
CONFIG_UEVENT_HELPER=y
CONFIG_UEVENT_HELPER_PATH="/sbin/hotplug"
CONFIG_DEVTMPFS=y
CONFIG_DEVTMPFS_MOUNT=y
# CONFIG_PREVENT_FIRMWARE_BUILD is not set
CONFIG_MTD=y
CONFIG_MTD_PARTITIONED_MASTER=y
CONFIG_MTD_UBI=y
CONFIG_MTD_UBI_FASTMAP=y
# CONFIG_INPUT is not set
# CONFIG_SERIO is not set
# CONFIG_VT is not set
# CONFIG_LEGACY_PTYS is not set
CONFIG_SERIAL_8250=y
# CONFIG_SERIAL_8250_DEPRECATED_OPTIONS is not set
CONFIG_SERIAL_8250_CONSOLE=y
CONFIG_SERIAL_8250_NR_UARTS=6
CONFIG_SERIAL_8250_RUNTIME_UARTS=6
CONFIG_SERIAL_8250_EXTENDED=y
CONFIG_SERIAL_8250_ASPEED_VUART=y
CONFIG_SERIAL_8250_SHARE_IRQ=y
CONFIG_SERIAL_OF_PLATFORM=y
# CONFIG_HW_RANDOM is not set
# CONFIG_DEVMEM is not set
# CONFIG_HWMON is not set
CONFIG_WATCHDOG_SYSFS=y
# CONFIG_USB_SUPPORT is not set
# CONFIG_VIRTIO_MENU is not set
# CONFIG_VHOST_MENU is not set
# CONFIG_IOMMU_SUPPORT is not set
CONFIG_ASPEED_LPC_CTRL=y
CONFIG_ASPEED_LPC_SNOOP=y
CONFIG_IIO=y
CONFIG_IIO_BUFFER=y
CONFIG_IIO_TRIGGERED_BUFFER=y
CONFIG_ASPEED_ADC=y
# CONFIG_NVMEM is not set
CONFIG_VALIDATE_FS_PARSER=y
# CONFIG_FILE_LOCKING is not set
# CONFIG_DNOTIFY is not set
# CONFIG_INOTIFY_USER is not set
CONFIG_TMPFS=y
CONFIG_UBIFS_FS=y
CONFIG_UBIFS_FS_AUTHENTICATION=y
CONFIG_SECURITY_DMESG_RESTRICT=y
CONFIG_FORTIFY_SOURCE=y
# CONFIG_CRYPTO_HW is not set
# CONFIG_XZ_DEC_X86 is not set
# CONFIG_XZ_DEC_POWERPC is not set
# CONFIG_XZ_DEC_IA64 is not set
# CONFIG_XZ_DEC_SPARC is not set
CONFIG_PRINTK_TIME=y
# CONFIG_SYMBOLIC_ERRNAME is not set
# CONFIG_DEBUG_BUGVERBOSE is not set
CONFIG_STRIP_ASM_SYMS=y
# CONFIG_DEBUG_MISC is not set
CONFIG_DEBUG_WX=y
CONFIG_SCHED_STACK_END_CHECK=y
CONFIG_DEBUG_MEMORY_INIT=y
CONFIG_PANIC_ON_OOPS=y
CONFIG_SOFTLOCKUP_DETECTOR=y
# CONFIG_DETECT_HUNG_TASK is not set
CONFIG_WQ_WATCHDOG=y
# CONFIG_SCHED_DEBUG is not set
# CONFIG_FTRACE is not set
CONFIG_DEBUG_USER=y
CONFIG_DEBUG_LL=y
CONFIG_DEBUG_LL_UART_8250=y
CONFIG_DEBUG_UART_PHYS=0x1e784000
CONFIG_DEBUG_UART_VIRT=0xfe784000
CONFIG_DEBUG_UNCOMPRESS=y
CONFIG_EARLY_PRINTK=y
# CONFIG_RUNTIME_TESTING_MENU is not set
